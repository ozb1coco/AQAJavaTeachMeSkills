package TeachMeSkills.com.com.Lesson6.HomeWorkp;

public class CargoTransport extends EarthTransport {
    private int loadingCapacity;

    public CargoTransport(int horsePower, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelExpense, int loadingCapacity) {
        super(horsePower, maxSpeed, weight, brand, numberOfWheels, fuelExpense);
        this.loadingCapacity = loadingCapacity;
    }

    public int getLoadingCapacity() {
        return this.loadingCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    public void checkLoadingCapacity(int loadingCargo) {
        if (this.getLoadingCapacity() >= loadingCargo) {
            System.out.println("Truck is loaded and going");
        } else {
            System.out.println("U need truck bigger");
        }

    }

    public String toString() {
        return "CargoTransport{loadingCapacity=" + this.loadingCapacity + "} " + super.toString() + " Power int KW: " + this.powerInKw();
    }
}
