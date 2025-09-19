

public class Palindrome {
    public static void main(String[] args) {
     
        int x=121;
        int original = x;
         int rev=0, rem;

    while(x != 0){
        rem = x%10;
        rev = rev*10+rem;
        x = x/10;
    }

    if(original==rev){
        
     System.out.println("Yes");
    }else if(x < 0){
        System.out.println("Not");
    }else{
        System.out.println("Not");
    }
       
    }
}