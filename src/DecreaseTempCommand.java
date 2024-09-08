public class DecreaseTempCommand implements Command {
    private Aircon aircon;

    public DecreaseTempCommand(Aircon aircon) {
        this.aircon = aircon;
    }

    @Override
    public void execute() {
        aircon.decreaseTemperature();
    }
}