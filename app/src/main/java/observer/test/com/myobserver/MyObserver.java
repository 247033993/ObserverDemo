package observer.test.com.myobserver;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * 创建时间: 17/8/18
 * 编写人：HBB
 * 描述：观察者
 */

public class MyObserver implements Observer {
    private Person person;
    private int i;
    public MyObserver(int i){
        this.i=i;
        Log.e("MyObserver","我是观察者"+i);
    }
    @Override
    public void update(Observable observable, Object o) {
        this.person= (Person) observable;
        Log.e("MyObserver","观察者"+i+"观察到数据发生变化"+person.toString()+"----"+o.toString());
    }
}
