package shanker.assignment.data;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pattern pattern = Pattern.compile("[A-Z]{1}.*[.]{1}");
        Matcher matcher = pattern.matcher("Hello World...");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Has been found");
        }else{
            System.out.println("Match not Found");
        }


    }
}
