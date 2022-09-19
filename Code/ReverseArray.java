public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        printArr(numbers);
        System.out.println();
        printArr(reverseArr(numbers));
    }
    static int[] reverseArr(int[] arr){
        int[] reverseNum = new int[arr.length];
        for(int i = arr.length-1;i >= 0;i--){
            reverseNum[arr.length-i-1] = arr[i];
        }
        return reverseNum;
    }
    static void printArr(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
