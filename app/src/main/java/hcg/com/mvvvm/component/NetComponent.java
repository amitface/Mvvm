package hcg.com.mvvvm.component;

import javax.inject.Singleton;

import dagger.Component;
import hcg.com.mvvvm.MainActivity;
import hcg.com.mvvvm.module.AppModule;
import hcg.com.mvvvm.module.MyModule;

@Singleton
@Component(modules={AppModule.class, MyModule.class})
public interface NetComponent {
   void inject(MainActivity activity);
   // void inject(MyFragment fragment);
   // void inject(MyService service);
}