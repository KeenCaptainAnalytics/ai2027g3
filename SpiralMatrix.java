public class SpiralMatrix {

    static void helper(int arr[][]){

        // boundary
        int leftCol = 0 , rightCol = arr[0].length-1;
        int upRow =0, bottomRow = arr.length-1;
        int maxEle = (rightCol+1)* (bottomRow+1);
        int count=0 ; // equal to maxEle then we will stop
        while(count<maxEle){
            // left to right
            for(int i = leftCol ;i<=rightCol&& count<maxEle;i++){
                System.out.println(arr[upRow][i]);
                count++;
            }
            upRow++;

            // top- bottom
            for(int i=upRow ;i <=bottomRow && count<maxEle;i++){
                System.out.println(arr[i][rightCol]);
                count++;
            }
            rightCol--;

            //  right to left
            for(int i=rightCol ;i >= leftCol && count<maxEle;i--){
                System.out.println(arr[bottomRow][i]);
                count++;
            }
            bottomRow--;

            // bottom to top
            for(int i= bottomRow ;i>= upRow && count< maxEle ;i--){
                System.out.println(arr[i][leftCol]);
                count++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        int [][]arr ={{1,2,3,4,5}
                , {6,7,8,9,10}
                , {11,12,13,14,15}
                , {16,17,18,19,20}
                , {21,22,23,24, 25}};

        helper(arr);
    }
}
