package pl.sdacademy.pogoda;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import pl.sdacademy.pogoda.model.Weather;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("What city weather you want to know?");
        Scanner scanner = new Scanner(System.in);
        String miasto = scanner.next();
        String url = "http://api.apixu.com/v1/current.json?key=da38b077b09949c4ad272615181808&q=" + miasto;
        scanner.close();

        //IOUtils obsługuje URL

        try {
            JSONObject json = new JSONObject(IOUtils.toString(new URL(url), Charset.forName("UTF-8")));

            Weather weather = new Weather();
            weather.setCity(json.getJSONObject("location").getString("name"));
            weather.setConditionText(json.getJSONObject("current").getJSONObject("condition").getString("text"));
            weather.setTemperature(json.getJSONObject("current").getDouble("temp_c"));
            weather.setFeelsLikeC(json.getJSONObject("current").getDouble("feelslike_c"));
            weather.setIocnUrl(json.getJSONObject("current").getJSONObject("condition").getString("icon"));

            System.out.println("");

            System.out.println(weather.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
