package TeachMeSkills.com.Lesson8.ClassWork;

import java.util.Random;

public class Car {
    String brand;
    int speed;
    double price;

    public Car() {
    }

    public Car(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }
    public void printInformationAboutCarMoving(){
        System.out.print("\n Car with brand: " + brand + "\n With max speed: " + speed
        + "\n With price: " + price + " is ");
        execution();
    }
    private void execution()
    {
        try{
            System.out.println(start());
        }catch (CarDidntStartException e)
        {
            System.out.print(e.getMessage());
        }
    }
    private String start() throws CarDidntStartException {
        String carStatus;
        Random random = new Random();
        int autoStarter = random.nextInt(20) + 1;
        if(autoStarter % 2 == 0)
        {
            throw new CarDidntStartException();
        }
        else{
            carStatus = " going! ";
        }
        return carStatus;
    }
}
