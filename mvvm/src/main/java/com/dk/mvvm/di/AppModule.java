package com.dk.mvvm.di;

import android.content.Context;

import com.dk.mvvm.MVVMApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by doronk on 29/09/2016.
 */

@Module
public class AppModule {

    @Provides
    Context provideContext(MVVMApplication application) {
        return application.getApplicationContext();
    }

}
