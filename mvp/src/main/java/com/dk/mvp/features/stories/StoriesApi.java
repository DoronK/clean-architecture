package com.dk.mvp.features.stories;


import com.dk.core.model.DataSourceA;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface StoriesApi {

    @GET("http://chegg-mobile-promotioms.s3.amazonaws.com/android/homework/android_homeword_datasourceA.json")
    Observable<DataSourceA> getData();

}