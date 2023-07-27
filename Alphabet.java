import java.util.Scanner;
public class Alphabet {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String newSentence = sentence.toLowerCase();
        String result = whatsMissing(newSentence);
        System.out.println("Missing letters: " + result);
        sc.close();
        
    }
    static String whatsMissing (String line){
        String alph = "abcdefghijklmnopqrstuvwxyz";
        for(int x = 0; x < line.length(); x++){
            char c = line.charAt(x);
            String s = Character.toString(c);
            if (alph.contains(s)){
                alph = alph.replace(s, "");
            }
            
        }
        return alph;

    }
}
