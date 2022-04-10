import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int highwayNumber;
        int primaryNumber;
        String direction;

        highwayNumber = scnr.nextInt();
        direction = highwayNumber % 2 == 1 ? "north/south" : "east/west";

        if ((highwayNumber >= 1) && (highwayNumber <= 99)) {
            System.out.print("I-" + highwayNumber + " is primary, going " + direction + ".");
        }
        else if ((highwayNumber >= 100) && (highwayNumber <= 999)) {
            primaryNumber = highwayNumber % 100;
            if (primaryNumber == 0) {
                System.out.print(highwayNumber + " is not a valid interstate highway number.");
            } else {
                System.out.print("I-" + highwayNumber + " is auxiliary, serving I-" + primaryNumber + ", going " + direction + ".");
            }
        }
        else {
            System.out.print(highwayNumber + " is not a valid interstate highway number.");
        }
    }
}
