package Questions_DSA;

public class binarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,34,45,76};
        int item=34;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==item){
                System.out.println("item found index no : "+mid);
                return;
            }
            else if (item>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            }
        System.out.println("Item not Found");
    }
}

