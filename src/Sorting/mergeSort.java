package Sorting;

public class mergeSort {
    public static void MergeSort(int[] arr,int start,int end){
        if(start<end) {
            int mid = start + (end - start) / 2;
            //left yaha divide kr rahe hai
            MergeSort(arr, start, mid);
            //Right same yaha bhi
            MergeSort(arr, mid + 1, end);

            //Merge left and right half combine krne k liye
            Merge(arr, start, mid, end);
        }
    }
    public static void Merge(int[] arr,int start,int mid,int end){
        //yaha left and right k element store krne k liye temp bana rahe hai
        int l=mid-start+1;
        int r=end-mid;
        int[] left=new int[l];
        int[] right=new int[r];

        // Yaha left and right m copy kr rahe hai main arr ka elements
        for(int i=0;i<l;i++){
            left[i]=arr[start+i];
        }
        for(int j=0;j<r;j++){
            right[j]=arr[mid+1+j];
        }

        // yaha mainly sort hoga and merge krenge har element ko
        int i=0,j=0;
        int k=start;
        while(i<l && j<r){
            if(left[i]>right[j]){
                arr[k]=right[j];
                j++;
            }else{
                arr[k]=left[i];
                i++;
            }
            k++;
        }

        // if left side element bach gaya hoga toh woh add krenge
        while(i<l){
            arr[k++]=left[i++];

        }

        // // if right side element bach gaya hoga toh woh add krenge
        while(j<r){
            arr[k++]=right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 49, 6, 12, -1, 4, -200};
        int n = arr.length - 1;
        MergeSort(arr, 0, n);

        //print k liye
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
