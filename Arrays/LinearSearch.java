import java.util.*;

public class LinearSearch{
    public static int Searching(int numbers[], int keys){
        for(int i=0; i<=numbers.length; i++){
            if(numbers[i]==keys){
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,16};
        int keys=10;
        int index = Searching(numbers, keys);

        if (index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Key is at index : "+index);
        }
    }
}