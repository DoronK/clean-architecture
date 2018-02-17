package com.dk.mvvm;

import android.app.Activity;


import com.dk.mvvm.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;

/**
 * Created by dkakuli on 15/02/2018.
 */

public class MVVMApplication extends DaggerApplication {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    protected AndroidInjector<? extends MVVMApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
