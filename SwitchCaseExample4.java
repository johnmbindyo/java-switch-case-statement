package devsought.switchcase;

public class SwitchCaseExample4 {

    public static void main(String... args) {

        String vehicleClass;
        String licenceClass = "C";
        switch (licenceClass) {
            default:
                vehicleClass = "Invalid licence class.";

            case ("A"):
                vehicleClass = "Scooter";

            case "B":
                vehicleClass = "scooter and car";

            case "C":
                vehicleClass = "scooter, car and van";

            case "D":
                vehicleClass = "scooter, car, van and bus";

            case "E":
                vehicleClass = "scooter, car, van, bus and truck";

        }
        System.out.println("Licence class " + licenceClass + " can drive vehicles " + vehicleClass);
    }
}
