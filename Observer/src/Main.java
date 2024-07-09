import Observer.*;
import Subject.*;

public class Main {
    public static void main(String[] args) {

        Subject Sujeto = new WeatherStation();

        Observer TemperatureDisplay = new TemperatureDisplay();
        Observer WeatherWarning = new WeatherWarning();

        Sujeto.addObserver(TemperatureDisplay);
        Sujeto.addObserver(WeatherWarning);

        Sujeto.notifyObservers(56);
        System.out.println();
        Sujeto.notifyObservers(108);

    }
}