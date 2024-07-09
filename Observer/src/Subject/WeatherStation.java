package Subject;

import Observer.Observer;

import java.util.ArrayList;

public class WeatherStation implements Subject{

    private ArrayList<Observer> Observadores;

    public WeatherStation(){
        this.Observadores = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observador) {
        Observadores.add(observador);
    }

    @Override
    public void removeObserver(Observer observador) {
        Observadores.remove(observador);
    }

    @Override
    public void notifyObservers(int temperature) {
        for(Observer observer : Observadores){
            observer.update(temperature);
        }
    }
}