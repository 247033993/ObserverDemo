package observer.test.com.myobserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity {
    private Person observable;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        observable=new Person();
    }
    public void add(View view){
        MyObserver myObserver=new MyObserver(i);
        i++;
        observable.addObserver(myObserver);
    }
    public void update(View view){
        Random random = new Random();
        int s = random.nextInt(i)%(i+1);
        observable.setName(""+s);
        observable.setAge(s);
        observable.setSex(s%2==0?"男":"女");
    }
}
