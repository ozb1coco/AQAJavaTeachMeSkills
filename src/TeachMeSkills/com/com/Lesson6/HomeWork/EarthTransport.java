package TeachMeSkills.com.com.Lesson6.HomeWork;

public class EarthTransport extends Transport {
    private int numberOfWheels;
    private int fuelExpense;

    public EarthTransport(int horsePower, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelExpense) {
        super(horsePower, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelExpense = fuelExpense;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getFuelExpense() {
        return this.fuelExpense;
    }

    public void setFuelExpense(int fuelExpense) {
        this.fuelExpense = fuelExpense;
    }
}
