public class TypeConversion{
    public static void main(String[] args) {
        int a = 25;
        long b = a;   
        /*a ke value ko b me bhej rhe h                   output 25 */

        //OR
        
        //    long a = 25;
        //    int b = a;     
         /* a => b   lossy error so long have 8 bytes and other hand int have 4 butes*/

        System.err.println(b);

    }
}