package TeachMeSkills.com.com.Lesson6.HomeWork;

public class CivilTransport extends AirTransport {
    private int valueAirPassengers;
    private boolean businessClass;

    public CivilTransport(int horsePower, int maxSpeed, int weight, String brand, int wingsLong, int minLengthOfLandingStrip, int valueAirPassengers, boolean businessClass) {
        super(horsePower, maxSpeed, weight, brand, wingsLong, minLengthOfLandingStrip);
        this.valueAirPassengers = valueAirPassengers;
        this.businessClass = businessClass;
    }

    public int getValueAirPassengers() {
        return this.valueAirPassengers;
    }

    public void setValueAirPassengers(int valueAirPassengers) {
        this.valueAirPassengers = valueAirPassengers;
    }

    public boolean isBusinessClass() {
        return this.businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void checkPassengerLimit(int loadingPassengers) {
        if (this.getValueAirPassengers() >= loadingPassengers) {
            System.out.println("Plane is loaded and go to fly");
        } else {
            System.out.println("U need plane bigger");
        }

    }

    public String toString() {
        return "CivilTransport{valueAirPassengers=" + this.valueAirPassengers + ", businessClass=" + this.businessClass + "} " + super.toString() + " Power int KW: " + this.powerInKw();
    }
}
