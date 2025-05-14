package Questions_DSA;

public class reverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        //Without Reverse
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //with reverse

        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
