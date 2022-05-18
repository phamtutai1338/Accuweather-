package jdbcdemo.Accuweather;

import com.google.gson.Gson;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class API {
    private static String keys;
    private static String city;
    private String country;
        Gson gson = new Gson();

    public API(String keys,String city, String country){
        this.keys = keys;
        this.city = city;
        this.country = country;
    }
    public static String  getJsonApi(String link) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        URL url = new  URL(link);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            stringBuilder.append(line);

        }
        return stringBuilder.toString();
}
    public static String  getLink(){


        String link="http://www.accuweather.com/vi/vn/hanoi/353412/daily-weather-forecast/353412?unit=c";

        return link;
    }
    public Root getWeatherData() throws IOException {
        Root Root = gson.fromJson(getJsonApi(getLink()), Root.class);
        return Root;

    }
    public static void main(String[]args)throws IOException{
        String data = getJsonApi(getLink());
        System.out.println(data);
    }
}
