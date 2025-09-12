import java.util.*;
public class Gst{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil+pen+eraser;

        // 18% Gst calculate
        float gst = total + (0.18f * total);
        

        System.out.println("total cost :" +total);

        System.out.println("18% gst is :" +gst);



    }
}



//qestions

        // byte b = 4;
        // char c = 'a';
        // short s = 512;
        // int i = 1000;
        // float f = 3.14f;
        // double d = 99.9954;

        //  Result = (f*b)+(i%c)-(d*s);

        // System.out.println(Result);