interface veh {
    void start();
    void stop();
    int getFuelLevel();
}
class Car implements veh {
    private int fuelLevel;

    public Car(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
}
class Motorcycle implements veh {
    private int fuelLevel;

    public Motorcycle(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }
}
public class vehcart {
    public static void main(String[] args) {
        veh myCar = new Car(50);
        myCar.start();
        System.out.println("Car Fuel Level: " + myCar.getFuelLevel());
        myCar.stop();

        System.out.println();

        veh myMotorcycle = new Motorcycle(20);
        myMotorcycle.start();
        System.out.println("Motorcycle Fuel Level: " + myMotorcycle.getFuelLevel());
        myMotorcycle.stop();
    }
}