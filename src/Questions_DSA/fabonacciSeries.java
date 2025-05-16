package Questions_DSA;

public class fabonacciSeries {

    static public int Fabonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fabonacci(n-1) + Fabonacci(n-2);
    }

    public static void main(String[] args) {
        int n = 9;
        for(int i =0;i<=n;i++){
            System.out.print(Fabonacci(i)+" ");
        }
    }
}
