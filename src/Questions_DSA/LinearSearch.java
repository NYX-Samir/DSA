package Questions_DSA;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,3,4,54,65,6,65};

        int item=65;

        for(int i=0;i<arr.length;i++){
            if(item==arr[i]){
                System.out.println("Item found index no. : "+i);
            }
        }

    }
}
