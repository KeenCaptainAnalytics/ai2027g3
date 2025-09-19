public class Recursion {

   
    static int sumHelper(int n){
        if(n ==0){
            return 0;
        }

       int result = sumHelper(n-1);
       return result + n ;
    }
    public static void main(String[] args) {
        int n = 4;
        int result = sumHelper(n);
        System.out.println(result);
    }
}
