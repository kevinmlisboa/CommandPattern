public class Main {
    public static void main(String[] args) {
        Aircon aircon = new Aircon();

        Command turnOn = new TurnOnCommand(aircon);
        Command turnOff = new TurnOffCommand(aircon);
        Command increaseTemp = new IncreaseTempCommand(aircon);
        Command decreaseTemp = new DecreaseTempCommand(aircon);
        RemoteControl remote = new RemoteControl();
        
        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(increaseTemp);
        remote.pressButton();

        remote.setCommand(decreaseTemp);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
    }
}