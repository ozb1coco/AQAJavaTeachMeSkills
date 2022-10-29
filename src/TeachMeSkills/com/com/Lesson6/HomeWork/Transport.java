package TeachMeSkills.com.com.Lesson6.HomeWork;

public class Transport {
    private int horsePower;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport(int horsePower, int maxSpeed, int weight, String brand) {
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public int gethorsePower() {
        return this.horsePower;
    }

    public void sethorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double powerInKw() {
        return (double)this.horsePower * 0.74;
    }
}
