public class Count1 {
    
    static int helper(int num){
        if(num ==0 ){
            return 0;
        }
        int d = num%10;
        int count = helper(num/10);
        if(d == 1){
            count = count+1;
        }
        return count;
    }
    public static void main(String[] args) {
        int count = helper(11320);
        System.out.println(count);
    }
}
