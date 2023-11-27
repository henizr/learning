package learning._java.WeatherStation.Weather_02;

public interface Subject {
    public void registerObserver();
    public void removeObserver();
    public void notifyObservers();
}
