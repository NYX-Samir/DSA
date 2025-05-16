package Questions_DSA;

public class countVowel {

    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        String hello = "Hello World ,Check how many vowels and consonants are in this String";
        String Cleaned = hello.replaceAll("\\s", "").toLowerCase();

        for (int i = 0; i < Cleaned.length(); i++) {
            char ch = Cleaned.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Numbers of vowels : "+vowels);
        System.out.println("Numbers of consonants : "+consonants);
        System.out.println("Total number of Characters : "+Cleaned.length());
    }
}