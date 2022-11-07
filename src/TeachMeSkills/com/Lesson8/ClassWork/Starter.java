package TeachMeSkills.com.Lesson8.ClassWork;

public class Starter {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 250, 2500000);
        Car bmw = new Car("BMW", 260, 3500000);
        audi.printInformationAboutCarMoving();
        bmw.printInformationAboutCarMoving();
    }

}
