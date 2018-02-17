package com.dk.mvvm.di;


import com.dk.mvvm.MVVMActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModule {


    @ContributesAndroidInjector(modules = StoriesMVVMModule.class)
    abstract MVVMActivity bindMVVMActivity();

    // Add bindings for other sub-components here
}
