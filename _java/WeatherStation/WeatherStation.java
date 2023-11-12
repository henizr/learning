package learning._java.WeatherStation;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = 
        new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurement(80, 90, 31);
        weatherData.setMeasurement(85, 90,   30.4f);
        weatherData.setMeasurement(89, 91, 32.3f);

    }
}
