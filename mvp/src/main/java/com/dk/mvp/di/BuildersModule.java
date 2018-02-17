package com.dk.mvp.di;

import com.dk.mvp.MVPActivity;
import com.dk.mvp.features.stories.StoriesModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BuildersModule {


    @ContributesAndroidInjector(modules = StoriesModule.class)
    abstract MVPActivity bindMainActivity();

    // Add bindings for other sub-components here
}
