package Questions_DSA;

public class EvenAndOdd {

    public static void main(String[] args) {

        int n=100;
        int[] Even= new int[n/2 + 1];
        int[] Odd=new int[n/2+1];
        int evenIndex=0;
        int oddIndex=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                Even[evenIndex]=i;
                evenIndex++;
            }
            else{
                Odd[oddIndex]=i;
                oddIndex++;
            }
        }
        System.out.println("Even Number");
        for(int j=0;j<evenIndex;j++){
            System.out.print(Even[j]+" ");
        }
        System.out.println();
        System.out.println("Odd Number");
        for(int j=0;j<oddIndex;j++){
            System.out.print(Odd[j]+" ");
        }

    }
}
