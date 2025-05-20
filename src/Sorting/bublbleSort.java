package Sorting;

public class bublbleSort {
    public static void main(String[] args) {
        int[] array ={1,2,56,4,32,1,9,-9};
        int size =array.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size-1;i++){
            System.out.print(array[i]+" ");
        }
    }
}
