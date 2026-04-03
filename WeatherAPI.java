import java.io.*;
import java.net.*;

public class WeatherAPI {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=demo");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("API Error");
        }
    }
}