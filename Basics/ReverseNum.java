import java.util.*;

public class ReverseNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
       
        while(n > 0){
            int lastNum = n%10;
            System.out.print(lastNum + " ");
            n = n/10;
        }
       System.out.println();
    }
}