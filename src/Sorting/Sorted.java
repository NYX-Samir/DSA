package Sorting;

import Array.Array;

import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr={2,35,54,8,9,0,4,-1};

        Arrays.sort(arr);

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
