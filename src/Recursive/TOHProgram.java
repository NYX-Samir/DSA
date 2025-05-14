package Recursive;

public class TOHProgram {

    static void TOH(int n,char source,char helper,char destination){
        if(n==1){
            System.out.println("Move Disk 1 "+source+" to "+destination);
            return;
        }

        TOH(n-1,source,destination,helper);
        System.out.println("Move Disk "+n+" from "+source+" to "+destination);
        TOH(n-1,helper,source,destination);

    }

    public static void main(String[] args) {
        int n=2;
        TOH(n,'A','B','C');

    }
}
