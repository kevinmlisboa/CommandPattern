public class IncreaseTempCommand implements Command {
    private Aircon aircon;

    public IncreaseTempCommand(Aircon aircon) {
        this.aircon = aircon;
    }

    @Override
    public void execute() {
        aircon.increaseTemperature();
    }
}
