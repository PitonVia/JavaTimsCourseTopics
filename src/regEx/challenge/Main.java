package regEx.challenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		// 1.) Write a RegEx to match the String	
		String challenge1 = "I want a bike.";
		System.out.println("Challenge1: " + challenge1.matches("^I want a bike.$"));

		// 2.) Write a RegEx to match both strings challenge1 and challenge2
		String challenge2 = "I want a ball.";
		// Note that \\w matches all matches a-z, A-Z, 0-9 and '_' and  '+' in the end means one or more times
		System.out.println("\nChallenge2: " + challenge1.matches("I want a b\\w+."));
		System.out.println("Challenge2: " + challenge2.matches("I want a b(ike|all)."));
		
		// 3.) Use Matcher.matches() instead of String.matches() used in Challenge 2.
        String c3Pattern = "I want a (bike|ball)."; // define a pattern 
        Pattern pattern = Pattern.compile(c3Pattern);
        Matcher c3matcher1 = pattern.matcher(challenge1);
        Matcher c3matcher2 = pattern.matcher(challenge2);
        System.out.println("\nChallenge3: " + c3matcher1.matches() + " & " + c3matcher2.matches());
       
        // Challenge 4 - replace all blank spaces with underscores:
        System.out.println("\nChallenge4: " + challenge1.replaceAll("\\s", "_")); // broader solution
        System.out.println("Challenge4: " + challenge1.replaceAll(" ", "_"));
        
        // Challenge 5 - write a RegEx to match the entire string
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println("\nChallenge5: " + challenge5.matches("[abcdefg]+")); // at least 1 or more of each char in []
        System.out.println("Challenge5: " + challenge5.matches("[a-g]+")); // better version of the above
        
        // Challenge 6 - write a RegEx to ONLY match the entire string in Challenge 5
        System.out.println("\nChallenge6: " + challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
        
        // Challenge 7 - write a reg expression to match pattern so that 
        // "kjsl.22" would match and "f5.12a" would not match
        String challenge7 = "abcd.135";
        System.out.println("\nChallenge7: " + challenge7.matches("^(\\D)+\\.(\\d)+$"));
        System.out.println("Challenge7: " + challenge7.matches("(^[a-z][A-z]+\\.\\d+$)"));
        
        
        
	}

}
