package Recursive;

public class SumRecursive {
    static int sumNumber(int n){
        if(n==1){
            return 1;
        }else{
            return n + sumNumber(n-1);
        }
    }
    public static void main(String[] args) {
        int n=10;
        int result = sumNumber(n);
        System.out.println(result);
    }
}
