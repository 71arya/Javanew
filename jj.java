import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        String capitalizedSentence = capitalizeWords(sentence);
        
        System.out.println("Capitalized sentence: " + capitalizedSentence);
    }
    
    public static String capitalizeWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }
        
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;
        
        for (char c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                sb.append(c);
            } else if (capitalizeNext) {
                sb.append(Character.toTitleCase(c));
                capitalizeNext = false;
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}