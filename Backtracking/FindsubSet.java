public class FindsubSet{
    public static void FindsubSet(String str, String ans, int i) {
        //base case
        if(i==str.length()){
            System.err.println(ans);
            return;
        }
        //yes choice
        FindsubSet(str, ans+str.charAt(i), i+1);
        //no choice
        FindsubSet(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        FindsubSet(str, "", 0);
    }
}