package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        // input pattern
        // source String
        Pattern pattern = Pattern.compile("core java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("We are learning Core Java");
        boolean matchFound = matcher.find();
        System.out.println(matchFound);
        if (matchFound){
            System.out.println("Match Found...!!!");
        }
        else {
            System.out.println("Match Not Found...!!!");
        }
    }
}
