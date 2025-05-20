package Sorting;

public class selectiveSort {
    public static void main(String[] args) {
        int[] arr={1,3,4,99,64, 25, 12, 22, 11};
        int size=arr.length;

        for(int i =0;i<size;i++){
            int midIndex=i;
            for(int j=i+1;j<size;j++){
                if(arr[j]>arr[midIndex]){
                    midIndex=j;
                }
            }
            int temp=arr[midIndex];
            arr[midIndex]=arr[i];
            arr[i]=temp;
        }
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
}
