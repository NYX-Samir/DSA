package Recursive;

public class nCr_Problem {
    static int nFact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*nFact(n-1);
    }
    static int rFact(int r){
        if(r==1 || r==0){
            return 1;
        }
        return r*rFact(r-1);
    }
    static int nrFact(int x){
        if(x==1 || x==0){
            return 1;
        }
        return x*nrFact(x-1);
    }
    static int nCr(int n,int r){
        if(r>n) return 0;

        int nfact=nFact(n);
        int rfact=rFact(r);
        int nrfact=nrFact(n-r);
        return nfact/(rfact*nrfact);

    }

     static long nCrrRecursive(int n , int r){
        if(r>n)
            return 0;

        if(r==0 || r==n)
            return 1;

        return nCrrRecursive(n-1,r-1)+nCrrRecursive(n-1,r);
     }
    public static void main(String[] args) {
        int n=10;
        int r=6;
        int Answer1= nCr(n,r);
        System.out.println("Result : "+Answer1);

        long Answer2=nCrrRecursive(n,r);
        System.out.println("Result : "+Answer2);
    }
}
