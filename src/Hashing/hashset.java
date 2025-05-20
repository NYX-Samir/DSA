package Hashing;
import java.util.ArrayList;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        if(set.contains(1)){
            System.out.println("Contain :" +1);
        }
        if(!set.contains(5)){
            System.out.println("Do not contain :"+5);
        }
        set.remove(1);
        System.out.println(set);
    }
}