public class UnaryOptr{
    public static void main(String[] args) {

        // //pre increment
        // int a = 10;
        // int b = ++a;
        // System.out.println(a);   /*output 11        1. value change*/
        // System.out.println(b);   /*output 11        2. value use*/

 //post increment
        int a = 10;
        int b = a++;
        System.out.println(a);   /*output 11        1. value use*/
        System.out.println(b);   /*output 10       2. value change*/


        
    }
}