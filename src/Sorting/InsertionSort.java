package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={4,6,8,3,12,38,2,1};
        for(int i =1;i< arr.length;i++){
            int cur=arr[i];
            int prev=i-1;

            while(prev>=0 && arr[prev]>cur){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=cur;
    }
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
}
