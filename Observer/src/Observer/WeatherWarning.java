package Observer;

public class WeatherWarning implements Observer{
    @Override
    public void update(int temperature) {
        if (temperature > 90){
            System.out.println("ADVERTENCIA: La temperatura actual supera los 90°");
        }
    }
}