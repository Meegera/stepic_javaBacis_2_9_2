package ttttransport;

public class bicycle extends Transport {
    private boolean highSpeed;
    private boolean brakes;

    public bicycle(String name, boolean wheelsCar, int numberPassenger, boolean highSpeed, boolean brakes) {
        super(name, wheelsCar, numberPassenger);
        this.highSpeed = highSpeed;
        this.brakes = brakes;
    }

    public boolean isHighSpeed() {
        return highSpeed;
    }

    public void setHighSpeed(boolean highSpeed) {
        this.highSpeed = highSpeed;
    }

    public boolean isBrakes() {
        return brakes;
    }

    public void setBrakes(boolean brakes) {
        this.brakes = brakes;
    }

    public void info(){
        System.out.println("Это велосипед!!!");
    }
}
