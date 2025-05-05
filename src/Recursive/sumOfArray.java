package Recursive;

public class sumOfArray {
    static int sumArray(int[] arr,int n){
        if(n<=0){
            return 0;
        }else{
            return arr[n-1]+sumArray(arr,n-1);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
       int result=sumArray(arr,arr.length);
        System.out.println(result);
    }
}
