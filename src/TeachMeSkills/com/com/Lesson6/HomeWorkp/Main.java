package TeachMeSkills.com.com.Lesson6.HomeWorkp;

public class Main {
    public static void main(String[] args) {
        LightTransport lightTransport = new LightTransport(106, 220, 1300, "Lada", 4, 7, "Universal", 5, 10);
        lightTransport.maxDistanceWithMaxSpeed();
        CargoTransport cargoTransport = new CargoTransport(250, 150, 2500, "MAN", 6, 25, 24);
        cargoTransport.checkLoadingCapacity(15);
        CivilTransport civilTransport = new CivilTransport(560, 700, 3000, "Boeng", 5, 500, 700, true);
        civilTransport.checkPassengerLimit(250);
        MilitaryTransport militaryTransport = new MilitaryTransport(600, 1700, 5600, "IL-2", 4, 250, true, 6);
        militaryTransport.shoot(2);
        militaryTransport.ejectionSystem(false);
    }
}
