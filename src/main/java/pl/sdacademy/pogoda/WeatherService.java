package pl.sdacademy.pogoda;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import pl.sdacademy.pogoda.model.Weather;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

public class WeatherService {

    private String finalUrl;

    public WeatherService(String url, String apiKey) {
        finalUrl = url + "?key=" + apiKey;
    }

    public void getWeatherWithGivenCity() {
        System.out.println("What city weather you want to know?");
        Scanner scanner = new Scanner(System.in);
        String miasto = scanner.next();
        getCityWeather(miasto);
        scanner.close();
    }

    public Weather getCityWeather(String city) {
        Weather weather = new Weather();
        String reqUrl = finalUrl + "&q=" + city;
        JSONObject json = null;
        try {
            json = new JSONObject(IOUtils.toString(new URL(reqUrl), Charset.forName("UTF-8")));

        } catch (IOException e) {
            e.printStackTrace();
        }
        weather.setCity(json.getJSONObject("location").getString("name"));
        weather.setConditionText(json.getJSONObject("current").getJSONObject("condition").getString("text"));
        weather.setTemperature(json.getJSONObject("current").getDouble("temp_c"));
        weather.setFeelsLikeC(json.getJSONObject("current").getDouble("feelslike_c"));
        weather.setIocnUrl(json.getJSONObject("current").getJSONObject("condition").getString("icon"));
        System.out.println(weather.toString());
        return weather;
    }
}