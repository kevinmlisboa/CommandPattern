public class TurnOnCommand implements Command {
    private Aircon aircon;

    public TurnOnCommand(Aircon aircon) {
        this.aircon = aircon;
    }

    @Override
    public void execute() {
        aircon.turnOn();
    }
}