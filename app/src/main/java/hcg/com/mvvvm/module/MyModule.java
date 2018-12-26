package hcg.com.mvvvm.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hcg.com.mvvvm.MyExample;
import hcg.com.mvvvm.MyExampleImpl;

@Module
public class MyModule {

    @Provides
    @Singleton
    public static MyExample provideMyExample() {
        return new MyExampleImpl();
    }
    
}