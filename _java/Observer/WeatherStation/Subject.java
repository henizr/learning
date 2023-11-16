package learning._java.Observer.WeatherStation;

public interface Subject {
    public void registerObserver();
    public void removeObserver();
    public void notifyObservers();
}
