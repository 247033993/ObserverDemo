package observer.test.com.myobserver.test;

import java.util.Observable;

/**
 * 创建时间: 17/8/23
 * 编写人：HBB
 * 描述：被观察者
 */

public class DataChange extends Observable {

    private static DataChange instance = null;

    public static DataChange getInstance() {
        if (null == instance) {
            instance = new DataChange();
        }
        return instance;
    }

    public void notifyDataChange(Data data) {
        //被观察者怎么通知观察者数据有改变了呢？？这里的两个方法是关键。
        setChanged();
        notifyObservers(data);//发出通知，这个参数将被被观察者的update方法中的第二个参数接收
    }
}
