public class One_Zero_Triangle{

 public static void One_Zero_Trianle(int n){
    //outer loop
    for(int i=1; i<=n; i++){
        //inner loop
        for(int j=1; j<=i; j++){
          if((i+j)%2==0) {  //even
            System.out.print("1"+" ");
          }  else{  //odd
            System.out.print("0"+" ");
          } 
        }
        //nextline
       System.out.println();
    }
  }
  public static void main(String[] args) {
    One_Zero_Trianle(5);
  }
}