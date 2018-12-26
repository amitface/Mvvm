package hcg.com.mvvvm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    MyExample mMyExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication) getApplicationContext())
                .getMyComponent()
                .inject(this);
        Toast.makeText(this, String.valueOf(mMyExample.getDate()),Toast.LENGTH_LONG ).show();
    }
}
