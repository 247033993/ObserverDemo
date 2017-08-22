package observer.test.com.myobserver;

import java.io.Serializable;
import java.util.Observable;

/**
 * 创建时间: 17/8/18
 * 编写人：HBB
 * 描述：被观察者
 * setChanged();告知数据改变
 * notifyObservers();发出信号通知观察者
 */

public class Person extends Observable implements Serializable{
    private int age;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        setChanged();
        notifyObservers("改变了年龄");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers("改变了名字");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        setChanged();
        notifyObservers("改变了性别");
    }

    @Override
    public String toString() {
        return "姓名："+this.name+",年龄："+this.age+",性别："+sex;
    }
}
