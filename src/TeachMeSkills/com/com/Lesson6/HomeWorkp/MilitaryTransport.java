package TeachMeSkills.com.com.Lesson6.HomeWorkp;

public class MilitaryTransport extends AirTransport {
    private boolean ejection;
    private int rocketValue;

    public MilitaryTransport(int horsePower, int maxSpeed, int weight, String brand, int wingsLong, int minLengthOfLandingStrip, boolean ejection, int rocketValue) {
        super(horsePower, maxSpeed, weight, brand, wingsLong, minLengthOfLandingStrip);
        this.ejection = ejection;
        this.rocketValue = rocketValue;
    }

    public boolean isEjection() {
        return this.ejection;
    }

    public void setEjection(boolean ejection) {
        this.ejection = ejection;
    }

    public int getRocketValue() {
        return this.rocketValue;
    }

    public void setRocketValue(int rocketValue) {
        this.rocketValue = rocketValue;
    }

    public void shoot(int rocketValue) {
        if (rocketValue > 0) {
            System.out.println("Rocket is going!");
        } else {
            System.out.println("ammo is absent");
        }

    }

    public void ejectionSystem(boolean ejection) {
        if (!this.isEjection()) {
            System.out.println("Ejection was successfully");
        } else {
            System.out.println("U don't have ejection systems");
        }

    }

    public String toString() {
        return "MilitaryTransport{ejection=" + this.ejection + ", rocketValue=" + this.rocketValue + "} " + super.toString() + " Power int KW: " + this.powerInKw();
    }
}
