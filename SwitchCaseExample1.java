package devsought.switchcase;

public class SwitchCaseExample1 {

     public static void main(String... args) {


        String vehicleClass;
        String licenceClass = "C";
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
                 break;
             case "E":
                 vehicleClass = "scooter, car, van, bus and truck";
                 break;
             default:
                 vehicleClass = "Invalid licence class.";
                 break;
         }
        System.out.println("Licence class " + licenceClass + " can drive vehicles " + vehicleClass);
    }
}
