package com.dk.mvvm.di;

import com.dk.mvvm.MVVMApplication;
import com.dk.core.di.ServerApiModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AppModule.class,
        ServerApiModule.class,
        AndroidSupportInjectionModule.class,
        BuildersModule.class
})
interface AppComponent extends AndroidInjector<MVVMApplication> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MVVMApplication> {
    }
}