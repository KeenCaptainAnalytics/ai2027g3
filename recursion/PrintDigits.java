public class PrintDigits {
    static void helper(int num){
        if(num==0){
            return;
        }
        int digit = num%10;
        System.out.print(digit+",");
        helper(num/10);
    }
    public static void main(String[] args) {
        helper(3242342);
    }
}
