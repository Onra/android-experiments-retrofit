package io.arnaudchrist.retrofitexperiments;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by arnaudchrist on 20/10/14.
 */
public interface Api {

    @GET("/weather")
    void getWeather(@Query("q") String cityName, Callback<WeatherResponse> callback);

}
