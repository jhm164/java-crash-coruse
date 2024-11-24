import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class File1 {

    public static void main(String[] args) {
        String s = "Hello World 12";

        // Find a match for any one of the patterns separated by | as in: cat|dog|fish
        // Pattern pattern = Pattern.compile("JJ|World", Pattern.CASE_INSENSITIVE);

        // Find one character from the options between the brackets
        // Pattern pattern = Pattern.compile("[rld]", Pattern.CASE_INSENSITIVE);

        // Find one character NOT between the brackets
        // Pattern pattern = Pattern.compile("[^Hello World]",
        // Pattern.CASE_INSENSITIVE);

        // Find one character from the range 0 to 9
        // Pattern pattern = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);

        Pattern pattern = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.find());
    }
}
