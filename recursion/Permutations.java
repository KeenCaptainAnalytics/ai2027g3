public class Permutations {
    static void print(char arr[]){
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void helper(char plate[] , int in){
        if(in ==2){
            print(plate);
            return;
        }
        plate[in] = 'B';
        helper(plate, in+1);
        plate[in] ='S';
        helper(plate, in+1);
        plate[in]='I';
        helper(plate, in+1);

    }
    public static void main(String[] args) {
        char plate[] = new char[2];
        helper(plate, 0);


    }
}
