import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        //return Pattern.compile("").matcher(dateString);
        return Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[- .](0?[1-9]|1[0-2])[- .](19|20)?[0-9][0-9]$").matcher(dateString);
    }
}
