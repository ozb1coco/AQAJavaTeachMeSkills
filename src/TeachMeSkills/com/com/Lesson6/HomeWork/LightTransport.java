package TeachMeSkills.com.com.Lesson6.HomeWork;

public class LightTransport extends EarthTransport {
    private String typeOfBody;
    private int valueOfPassengers;
    private int time;

    public LightTransport(int horsePower, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelExpense, String typeOfBody, int valueOfPassengers, int time) {
        super(horsePower, maxSpeed, weight, brand, numberOfWheels, fuelExpense);
        this.typeOfBody = typeOfBody;
        this.valueOfPassengers = valueOfPassengers;
        this.time = time;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getTypeOfBody() {
        return this.typeOfBody;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public int getValueOfPassengers() {
        return this.valueOfPassengers;
    }

    public void setValueOfPassengers(int valueOfPassengers) {
        this.valueOfPassengers = valueOfPassengers;
    }

    public String toString() {
        return "LightTransport{typeOfBody='" + this.typeOfBody + '\'' + ", valueOfPassengers=" + this.valueOfPassengers + "} " + super.toString() + " Power int KW: " + this.powerInKw();
    }

    public void maxDistanceWithMaxSpeed() {
        System.out.println("For " + this.getTime() + " hours auto " + this.getBrand() + " going with max speed " + this.getMaxSpeed() + " km/hour get " + this.getTime() * this.getMaxSpeed() + " killometrs  and spend " + this.usedFuelCalculate() + " liters of fuel");
    }

    private int usedFuelCalculate() {
        return this.getTime() * this.getMaxSpeed() / this.getFuelExpense();
    }
}
