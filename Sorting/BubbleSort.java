//Descending order sorting

public class BubbleSort{
    public static void bubble(int arr[]){
        //turn
      for(int turn=0; turn<arr.length; turn++){
   
        //inner
        for(int j=0; j<arr.length-1-turn; j++){
            if(arr[j] < arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
      }
    
    }
    //print the arr
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
      public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        bubble(arr);
        printArr(arr);
    }
}
