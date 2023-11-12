package learning._java.WeatherStation;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void measurementChanged(){
        notifyObservers();
    }
    
    public void setMeasurement(float temperature, 
                                float humidity,
                                float pressure){
                                    this.temperature = temperature;
                                    this.humidity = humidity;
                                    this.pressure = pressure;
                                    measurementChanged();
                                }
    
}
