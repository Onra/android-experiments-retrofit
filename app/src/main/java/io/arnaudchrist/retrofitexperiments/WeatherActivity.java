package io.arnaudchrist.retrofitexperiments;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class WeatherActivity extends Activity {

    private static String LOG_TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        RestClient.get().getWeather("Luxembourg", new Callback<WeatherResponse>() {
            @Override
            public void success(WeatherResponse weatherResponse, Response response) {
                Log.i(LOG_TAG, weatherResponse.getBase());
                Log.i(LOG_TAG, weatherResponse.getWeather()[0].getDescription());
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(LOG_TAG, "Error while getting weather: " + error.toString());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_weather, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
