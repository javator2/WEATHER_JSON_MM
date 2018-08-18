package pl.sdacademy.pogoda;

import pl.sdacademy.pogoda.model.Weather;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {


        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json", "da38b077b09949c4ad272615181808");
        weatherService.getWeatherWithGivenCity();
    }
}


//        System.out.println("What city weather you want to know?");
//        Scanner scanner = new Scanner(System.in);
//        String miasto = scanner.next();
//        String url = "http://api.apixu.com/v1/current.json?key=da38b077b09949c4ad272615181808&q=" + miasto;
//        scanner.close();

//IOUtils obsługuje URL

//            System.out.println("");
//            Iterator<String> keys = json.getJSONObject("current").keys();
//            for (Iterator<String> it = keys; it.hasNext(); ) {
//                String k = it.next();
//                System.out.println(k);
//            }

