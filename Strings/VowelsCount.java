
import java.util.Scanner;

public class VowelsCount {

    public static void main(String[] args) {
        System.out.print("Enter Strings : ");
        String str = new Scanner(System.in).next();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') count++;

        }
          System.out.println("The count of vowels is : " +count);
    }
  
}
