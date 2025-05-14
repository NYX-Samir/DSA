package Questions_DSA;

public class max_min {

    public static void main(String[] args) {

        int arr[]={-1,0,1,2,3,4,5,6};

        //MAX
        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        //MIN

        int min=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
