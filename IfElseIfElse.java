package devsought.switchcase;

public class IfElseIfElse {

    public static void main(String... args) {

        String vehicleClass;
        String licenceClass = "E";
        if (licenceClass.contentEquals("A")) {
            vehicleClass = "Scooter";
        } else if (licenceClass.contentEquals("B")) {
            vehicleClass = "scooter and car";
        } else if (licenceClass.contentEquals("C")) {
            vehicleClass = "scooter, car and van";
        } else if (licenceClass.contentEquals("D")) {
            vehicleClass = "scooter, car, van and bus";
        } else if (licenceClass.contentEquals("E")) {
            vehicleClass = "scooter, car, van, bus and truck";
        } else {
            vehicleClass = "Invalid licence class.";
        }
        System.out.println("Licence class " + licenceClass + " can drive vehicles " + vehicleClass);
    }
}
