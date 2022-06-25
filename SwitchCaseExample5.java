package devsought.switchcase;

enum DriverAge {
    VERY_YOUNG, YOUNG, MIDAGE, SENIOR, OLD
}

public class SwitchCaseExample5 {

    public static void main(String... args) {

        String vehicleClass;
        String licenceClass = "E";
        DriverAge driverAge = DriverAge.VERY_YOUNG;
        switch (licenceClass) {
            case ("A"):
                vehicleClass = "Scooter";
                break;
            case "B":
                vehicleClass = "scooter and car";
                break;
            case "C":
                vehicleClass = "scooter, car and van";
                break;
            case "D":
                vehicleClass = "scooter, car, van and bus";
                switch (driverAge) {
                    case VERY_YOUNG:
                        vehicleClass += ".But a very young driver should be careful driving buses.";
                        break;
                    case OLD:
                        vehicleClass += ".An old driver should not drive buses";
                }
                break;
            case "E":
                vehicleClass = "scooter, car, van, bus and truck";
                switch (driverAge) {
                    case VERY_YOUNG:
                        vehicleClass += ".But a very young driver should be careful driving buses and trucks.";
                        break;
                    case OLD:
                        vehicleClass += ".An old driver should not drive buses and trucks.";
                }
                break;
            default:
                vehicleClass = "Invalid licence class.";
             
        }
        System.out.println("Licence class " + licenceClass + " can drive vehicles " + vehicleClass);
    }
}
