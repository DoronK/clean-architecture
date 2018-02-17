package com.dk.mvp.di;

import android.content.Context;

import com.dk.mvp.MVPApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by doronk on 29/09/2016.
 */

@Module
public class AppModule {

    @Provides
    Context provideContext(MVPApplication application) {
        return application.getApplicationContext();
    }

}
