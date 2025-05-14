package Questions_DSA;

import java.sql.SQLOutput;

public class Palimdrome {
    public static void main(String[] args) {
        String st="RE PA P ER";
        String Cleaned = st.replaceAll("\\s","").toLowerCase();
        System.out.println(Cleaned);

        String reverse="";
        for(int i= Cleaned.length()-1;i>=0;i--){
            reverse += Cleaned.charAt(i);
        }
        System.out.println(reverse);
            if(Cleaned.equals(reverse)){
                System.out.println("String is Palimdrome");
            }else{
                System.out.println("String is not a Palimdrome");
            }
    }
}
