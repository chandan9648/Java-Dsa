
import java.util.*;

public class AvgOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Input :");
        double a = sc.nextDouble();

        System.out.println("Enter Second Input :");
        double b = sc.nextDouble();

        System.out.println("Enter first Input :");
        double c = sc.nextDouble();
        System.out.print("The total avarage of : " + avg(a, b, c) + "\n");
    }

    public static double avg(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
