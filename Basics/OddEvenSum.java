import java.util.*;

public class OddEvenSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int evenSum = 0;
        int oddSum = 0;
        int choice = 0;
        do { 
            System.out.println("Enter a number : ");
            int num = sc.nextInt();

            if( num % 2 == 0){
                evenSum += num;
            }else{
                oddSum += num;
            }

            System.out.println("press 1 for continu or 0 for no ");
            choice = sc.nextInt();

        } while (choice==1);

        System.out.println("Sum of even Number : " +evenSum);
        System.out.println("Sum of odd Number : " +oddSum);
    }
}