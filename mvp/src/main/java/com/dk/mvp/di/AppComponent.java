package com.dk.mvp.di;

import com.dk.core.di.NetworkModule;
import com.dk.mvp.MVPApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AppModule.class,
        NetworkModule.class,
        AndroidSupportInjectionModule.class,
        BuildersModule.class
})
interface AppComponent extends AndroidInjector<MVPApplication> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MVPApplication> {
    }
}