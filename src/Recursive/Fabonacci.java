package Recursive;

public class Fabonacci {

    static int fabonacciSeries(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fabonacciSeries(n-1) + fabonacciSeries(n-2);
    }

    public static void main(String[] args) {
        int n =7;
        for(int i =0;i<=n;i++){
            System.out.println(fabonacciSeries(i));
        }
    }
}
