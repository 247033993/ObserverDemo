package observer.test.com.myobserver.test;

import java.util.Observable;
import java.util.Observer;

/**
 * 创建时间: 17/8/23
 * 编写人：HBB
 * 描述：观察者
 */

public abstract class DataWatcher implements Observer {
    @Override
    public void update(Observable observable, Object data) {
    }
}
