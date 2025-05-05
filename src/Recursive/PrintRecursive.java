package Recursive;

public class PrintRecursive {
    static int printnumber1(int n){
        if(n==1){
            System.out.print(n+"\t");
            return 1;
        }else{
            System.out.print(n+"\t");
           return printnumber1(n-1);
        }
    }
    static int printnumber2(int n){
        if(n==1){
            System.out.print(n+"\t");
            return 1;
        }else{
            printnumber2(n-1);
            System.out.print(n+"\t");
            return 0;
        }
    }
    public static void main(String[] args) {

        int n=10;
        printnumber1(n);
        System.out.println();
        printnumber2(n);
    }

}
