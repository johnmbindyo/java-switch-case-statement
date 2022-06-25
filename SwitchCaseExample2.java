package devsought.switchcase;

public class SwitchCaseExample2 {

    public static void main(String... args) {
        int mark = 50;
        String comment;
        switch (mark) {
            case (mark > 0 && mark < 40):
                comment = "Fail";
                break;
            case (mark > 40 && mark < 55):
                comment = "Pass";
                break;
            case (mark > 55 && mark < 75):
                comment = "Good";
                break;
            case (mark > 75 && mark <= 100):
                comment = "Excellent";
                break;
            default:
                comment = "Invalid mark";
                break;
        }
        System.out.println("Mark =" +mark + ", comment " + comment);
    }
}
