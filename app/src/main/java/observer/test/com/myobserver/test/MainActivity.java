package observer.test.com.myobserver.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.Observable;

import observer.test.com.myobserver.R;

/**
 * 创建时间: 17/8/23
 * 编写人：HBB
 * 描述：
 */

public class MainActivity extends Activity {

    private DataWatcher watcher = new DataWatcher() {

        @Override
        public void update(Observable observable, Object data) {
            super.update(observable, data);
            //观察者接受到被观察者的通知，来更新自己的数据操作。
            Data mData = (Data)data;
            Log.i("Test", "mData---->>"+mData.getDataChange());
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //模拟被观察者数据改变，更新数据。
        Data mData = new Data();
        mData.setDataChange(0);
        DataChange.getInstance().notifyDataChange(mData);

    }


    @Override
    protected void onResume() {
        super.onResume();
        //观察者往被观察者中添加订阅事件。
        DataChange.getInstance().addObserver(watcher);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //观察者从被观察者队列中移除
        DataChange.getInstance().deleteObserver(watcher);
    }
}