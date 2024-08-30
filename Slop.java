import java.util.Scanner;

public class Slop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = s.nextDouble();
        System.out.print("enter y1: ");
        double y1 = s.nextDouble();

        System.out.print("Entr x2: ");
        double x2 = s.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = s.nextDouble();

        if (x2 - x1 == 0) {
            System.out.println("no slop");
        } else {
            double slope = (y2 - y1) / (x2 - x1);
            System.out.println("slope(" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + slope);
        }

    }
}
