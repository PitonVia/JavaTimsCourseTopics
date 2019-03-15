package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Logical Operators with RegEx: 
	
	// and - used implicitly, e.g. when using "abc", it's actually "a" and "b" and "c".
	// or - '|' - [Hh]arry = [H|h]arry
	// not - '!' and '[^abc]' - when ^ used in [ ] it is used as NOT (i.e. all except for 'abc')

//Negative look ahead provides the possibility to exclude a pattern. When a string should not
//be followed by another string. Negative look ahead are defined via (?!pattern).
//For example, 'a(?!b)' will match "a" if "a" is not followed by "b".

//Positive look ahead - 'a(?=b)' - want to find all matches of 'a' followed by 'b', but
//we did not want to include 'b' in the match.

public class regExDemoPt3 {

	public static void main(String[] args) {
		
		String alphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
		
		System.out.println("------------- Example 14: Logical Operator 'or' -----------");
        
		// 14.) using logical operator 'or'
		System.out.println("harry".replaceAll("[hH]arry", "Larry"));  // old example without '|'
		System.out.println("harry".replaceAll("[h|H]arry", "Larry")); // using operator '|'
		System.out.println("Harry".replaceAll("[h|H]arry", "Larry"));
		
		

        System.out.println("\n------------- Example 15: Logical Operator 'not' -----------");

		// 15.) [^abc]' - when ^ used in [ ] it is used as NOT (i.e. all except for 'abc')
		String tvTest = "tstvtkt";
		
		// We want to find all 't' that are Not followed by 'v'
		
		// When we use "t[^v]" this RegEx implies that there must be some char after t that is not v. 
		// Hence it only finds 2 such occurrences and does not return the last 't' that is not followed by any char.  
		
		// When we use "t(?!v)" it will find all 't' regardless of any characters after 't'.
		
		// "t(?=v)" - positive lookahead, if we wanted to find all 't' that are followed by 'v' without including 'v'.
		
//		String tNotVRegEx = "t[^v]"; // returns 2 occurrences
		String tNotVRegEx = "t(?!v)"; // negative lookahead returns 3 occurrences
			
		Pattern tNotVPattern = Pattern.compile(tNotVRegEx);
		Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);
		
		int count = 0;
		while (tNotVMatcher.find()) {
			count++;
			System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
		}
		
		System.out.println("\n------------- Example 16: US phone number pattern -----------");
		
		// 16.) reg expression to validate US Phone #
        // E.g. '(800) 123-4567'
        //    ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
		
		// '^' means that there should not be anything before the start of expression
		// '\' escape char to indicate that we want e.g. '(' to be included literally
		// '{1} are quantifiers specifying how many chars of that type will follow
        // $ - means that if anything comes after the expression, then there will be NO match
		
		String phone1 = "1234567890";  // Shouldn't match
        String phone2 = "(123) 456-7890"; // match
        String phone3 = "123 456-7890"; // Shouldn't match
        String phone4 = "(123)456-7890"; // Shouldn't match

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        
        System.out.println("\n------------- Example 17: VISA card number -----------");
        
        // Another example, validation of the Visa card #:
        // Note that number always starts with '4' and that last 3 numbers are optional so '?" is used
        // ^4[0-9]{12}([0-9]{3})?$

        String visa1 = "4444444444444"; // should match
        String visa2 = "5444444444444"; // shouldn't match
        String visa3 = "4444444444444444";  // should match
        String visa4 = "4444";  // shouldn't match

        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));

	}

}
