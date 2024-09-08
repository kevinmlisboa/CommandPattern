public class Aircon {
    private int temperature = 28;

    public void turnOn() {
        System.out.println("Aircon is now ON.");
    }

    public void turnOff() {
        System.out.println("Aircon is now OFF.");
    }

    public void increaseTemperature() {
        temperature++;
        System.out.println("Aircon temperature increased to " + temperature + "°C.");
    }

    public void decreaseTemperature() {
        temperature--;
        System.out.println("Aircon temperature decreased to " + temperature + "°C.");
    }
}
