package com.dk.core.api;


import com.dk.core.model.DataSourceA;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ServerApi {

    @GET("general.json")
    Observable<DataSourceA> getData();

}