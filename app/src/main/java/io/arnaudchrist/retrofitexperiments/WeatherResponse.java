package io.arnaudchrist.retrofitexperiments;

/**
 * Created by arnaudchrist on 20/10/14.
 */
public class WeatherResponse {

    private int cod;
    private String base;
    Weather[] weather;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }
}
