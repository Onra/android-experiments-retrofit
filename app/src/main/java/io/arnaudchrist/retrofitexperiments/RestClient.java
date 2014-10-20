package io.arnaudchrist.retrofitexperiments;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by arnaudchrist on 20/10/14.
 */
public class RestClient {

    private static Api REST_CLIENT;
    private static String ROOT = "http://api.openweathermap.org/data/2.5";

    static {
        setupRestClient();
    }

    public static Api get() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {
        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(ROOT)
                .setClient(new OkClient(new OkHttpClient()))
                .setLogLevel(RestAdapter.LogLevel.FULL);

        RestAdapter restAdapter = builder.build();
        REST_CLIENT = restAdapter.create(Api.class);
    }


}
