public class TurnOffCommand implements Command {
    private Aircon aircon;

    public TurnOffCommand(Aircon aircon) {
        this.aircon = aircon;
    }

    @Override
    public void execute() {
        aircon.turnOff();
    }
}