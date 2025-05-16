package Questions_DSA;

public class KadaneWithSubarray {

    public static void main(String[] args) {

        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3,5,6,8,2,-9,6,3,-10};

        int curSum= arr[0];
        int maxSum=arr[0];
        int start=0,end=0,temp=0;

        for(int i =1;i< arr.length;i++){
            if(arr[i]>curSum+arr[i]){
                curSum=arr[i];
                temp=i;
            }else{
                curSum +=arr[i];
            }

            if(maxSum<curSum){
                maxSum=curSum;
                start=temp;
                end=i;
            }

        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.print("Subarray : ");
        for (int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
