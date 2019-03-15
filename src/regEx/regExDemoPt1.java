package regEx;


// String methods that accept RegEx as args are: matches(), replaceAll(), split()

//REGULAR EXPRESSION - defines a search pattern for strings. Often used to validate user input.
//RegEx is used to search Strings for a a specific pattern or to validate that user input matches a specific pattern.


public class regExDemoPt1 {

	public static void main(String[] args) {
		
		System.out.println("------------- Example 1: replaceAll() -----------");
		String string = "I am a string. Yes, I am.";
	    System.out.println(string);
	    
	    // 1.) replaceAll() finds a pattern (1-st arg) and replaces all its occurrences with 2-nd arg
	    String yourString = string.replaceAll("I", "You");
	    System.out.println(yourString);
	    System.out.println("\n------------- Example 2: '.' -----------");
	    
	    String alphaNumeric = "Abcdsfsj343JJ-094323423#@Abcdsfs.m";
        
	    // 2.) "." is a wildcard that matches any character
        System.out.println(alphaNumeric.replaceAll(".","Y"));
        
        System.out.println("\n------------- Example 3: '^' ------------");
        
        // 3.) "^" - looks for chars only at the beginning of the string. Replacement can be any length.
        System.out.println(alphaNumeric.replaceAll("^Abcdsfs","--XX--"));
        
        // Here replaceAll() will match and replace all the occurrences, not only the 1-st!
        System.out.println(alphaNumeric.replaceAll("Abcdsfs","--XX--"));
        
        System.out.println("\n------------- Example 4: '$' -----------");
        
        // 4.) "$" - looks for chars only at the end of the string.
        System.out.println(alphaNumeric.replaceAll("sfs.m$","--THE END"));
        
        System.out.println("\n------------- Example 5: matches() -----------");
        
        // 5.) .matches() returns true if string as a whole matches RegEx in the arg.
        System.out.println(alphaNumeric.matches("^Abcdsfs")); // this will Not match!
        System.out.println(alphaNumeric.matches("^Abcdsfsj343JJ-094323423Abcdsfs.m"));
        
        System.out.println("\n------------- Example 5: '[]' -----------");

        // "[]" - any occurrences of individual character(s) in [] are replaced by replacement String:
        System.out.println(alphaNumeric.replaceAll("[csf]","-X-"));
        
        // "[]" - char(s) in [] are replaced only if followed by char(s) in the next []:
        System.out.println(alphaNumeric.replaceAll("[csf][dj]","-O-"));
        
        System.out.println("\n------------- Example 6: special cases for '[]' -----------");
        
        // 6.) Replaces String "harry" or "Harry" to "Harry" - note how [] are used to identify both "h" and "H"
        System.out.println("harry".replaceAll("[Hh]arry","Harry")); // could also use "(?i)[h]arry"
        System.out.println("Harry".replaceAll("[Hh]arry","Harry")); 
        
        // Replace all the alphanumeric chars except for specific characters.
        // When '^' in inside [] all chars EXCEPT for charts inside [] will be replaced:
        System.out.println(alphaNumeric.replaceAll("[^csf]","X"));
        
        System.out.println("\n------------- Example 7: ranges of chars with '[]' -----------");
        
        // 7.) Replace ranges of chars and num from a to f and from 1 to 4 use '-' inside [];
        System.out.println(alphaNumeric.replaceAll("[abcdefj1234]","O"));
        System.out.println(alphaNumeric.replaceAll("[a-j1-4]","O")); // same as above, but shorter RegEx!
        
        // use '(?i)' to ignore case sensitivity
        System.out.println(alphaNumeric.replaceAll("(?i)[a-j1-4]","O")); // (?i) ignores case sensitivity
        // Note for a unicode string we'd have to use '(?iu)' instead!!
        
        System.out.println("\n------------- Example 8: all digits & non-digits '[]' -----------");
        System.out.println(alphaNumeric);
        
        // 8.) use "\\d"  to replace all numbers in the string
        System.out.println(alphaNumeric.replaceAll("[0-9]","-"));
        // same as above:
        System.out.println(alphaNumeric.replaceAll("[\\d]","-"));
        
        // use "\\D"  to replace all non-digits in the string
        System.out.println(alphaNumeric.replaceAll("[\\D]","-"));
        
        System.out.println("\n------------- Example 9: remove spaces '[]' -----------");
        
        String hasWhiteSpace = "I have blanks and\ta tab, and also a new line\n";
        System.out.println(hasWhiteSpace);
        
        // 9.) use '\\s' to remove white spaces:
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        
        // In case you only wanted to replace a tab and a new line with with a space:
        System.out.println(hasWhiteSpace.replaceAll("[\t\n]", " "));
        
        // Also, there is a way to replace all non-space chars using '\\S'
        System.out.println(hasWhiteSpace.replaceAll("\\S", "-"));
        
        System.out.println("\n------------- Example 10: '\\w' -----------");
        
        // 10.) Powerful RegEx: '\\w' matches a-z, A-Z, 0-9 and '_' (only special chars and spaces are not affected)
        System.out.println(alphaNumeric.replaceAll("\\w"," "));
        System.out.println(hasWhiteSpace.replaceAll("\\w","-"));
        
        // '\\W' matches EVERYTHING except for: a-z, A-Z, 0-9 and '_' 
        System.out.println(alphaNumeric.replaceAll("\\W"," "));
        System.out.println(hasWhiteSpace.replaceAll("\\W","-"));
        
        System.out.println("\n------------- Example 11: boundary '\\b' -----------");
        
        // 11.) to match a word's boundary and surround it with "'":
        System.out.println(hasWhiteSpace.replaceAll("\\b", "'"));
	}

}
