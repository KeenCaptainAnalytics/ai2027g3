class DiagonalTraverse{

    static void helper(int arr[][]){
        int i=0,j =0;
        boolean isUp = false;

        while(i!=3 || j!=3){
            System.out.print(arr[i][j]+" ");
            if(isUp == false){
                if(j==0 && i+1<= 3){
                    i = i+1;
                    isUp= true;
                }
                else if(i == 3 && j+1<=3){
                    j= j+1;
                    isUp= true;
                }
                else{
                    i = i+1;
                    j = j-1;
                }
            }
            else{
                if(i==0 && j+1<= 3){
                    j = j+1;
                    isUp = false;
                }
                else if(j==3 && i+1<= 3){
                    i = i+1;
                    isUp= false;
                }
                else{
                    i= i-1;
                    j =j+1;
                }
            }
            
        }

        System.out.println(arr[i][j]);

    }
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        helper(arr);
    }
}