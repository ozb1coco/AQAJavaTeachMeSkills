package TeachMeSkills.com.com.Lesson6.HomeWork;

public class AirTransport extends Transport {
    private int wingsLong;
    private int minLengthOfLandingStrip;

    public AirTransport(int horsePower, int maxSpeed, int weight, String brand, int wingsLong, int minLengthOfLandingStrip) {
        super(horsePower, maxSpeed, weight, brand);
        this.wingsLong = wingsLong;
        this.minLengthOfLandingStrip = minLengthOfLandingStrip;
    }

    public int getWingsLong() {
        return this.wingsLong;
    }

    public void setWingsLong(int wingsLong) {
        this.wingsLong = wingsLong;
    }

    public int getMinLengthOfLandingStrip() {
        return this.minLengthOfLandingStrip;
    }

    public void setMinLengthOfLandingStrip(int minLengthOfLandingStrip) {
        this.minLengthOfLandingStrip = minLengthOfLandingStrip;
    }
}

