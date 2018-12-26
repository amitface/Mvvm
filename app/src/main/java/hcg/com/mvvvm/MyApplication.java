package hcg.com.mvvvm;


import android.app.Application;


import hcg.com.mvvvm.component.DaggerNetComponent;
import hcg.com.mvvvm.component.NetComponent;
import hcg.com.mvvvm.module.AppModule;
import hcg.com.mvvvm.module.MyModule;

public class MyApplication extends Application {
    private NetComponent mMyComponent;

//    @Inject
//    DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        mMyComponent = createMyComponent();
    }

    public NetComponent getMyComponent() {
        return mMyComponent;
    }

    private NetComponent createMyComponent() {
        return DaggerNetComponent
                .builder()
                .appModule(new AppModule(this))
                .myModule(new MyModule())
                .build();
    }

//    @Override
//    public AndroidInjector<Activity> activityInjector() {
//        return activityDispatchingAndroidInjector;
//    }
}