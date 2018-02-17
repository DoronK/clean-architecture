package com.dk.mvp;

import android.app.Activity;

import com.dk.mvp.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;

/**
 * Created by dkakuli on 15/02/2018.
 */

public class MVPApplication extends DaggerApplication {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    protected AndroidInjector<? extends MVPApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }
}
