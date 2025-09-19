public class Factorial {

    static int  factorialHelper(int n){
        if(n ==0 || n ==1){
            return 1;
        }

        int result = factorialHelper(n-1);
        result = result * n ;
        return result;
    }
    public static void main(String[] args) {
        // print the factorial of a number

        int n = 5 ; 
       int result = factorialHelper(n);
       System.out.println(result);

    }
}
