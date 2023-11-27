/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Entity.Weather;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * This class controls and manages the flow of weather-related tasks and data between the Weather Screen and the Weather API
 * @author rschi
 */
public class WeatherController {
    private Weather weather;

    public Weather getWeather() {
        return this.weather;
    }

    public void setWeather() {
        String apikey = "7490a2568971b20bf108357eded5fcc7";
        String city = "Cape Girardeau";

        try {
            String apiHost = "http://api.weatherstack.com/current?access_key=" + apikey + "&query=" + city +"&units=f";
            URL url = new URL(apiHost);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            String jasonPackage = response.toString();

            int temperature = Integer.parseInt(jasonPackage.split("\"temperature\":")[1].split(",")[0]);
            String condition = jasonPackage.split("\"weather_descriptions\":\\[\"")[1].split("\"")[0];

            this.weather = new Weather(temperature, condition);

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
