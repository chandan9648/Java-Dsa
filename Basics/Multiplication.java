
import java.util.*;

public class Multiplication {

    public static void main(String[] args) {
        System.out.print("Enter the number for mulitiplication : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
