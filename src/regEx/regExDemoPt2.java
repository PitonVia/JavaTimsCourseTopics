package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//QUANTIFIERS - specify how often an element in a reg expression can occur.
	//Lazy/Reluctant Quantifiers '*?' - once match was found, will not grab text between params
	//Greedy Quantifiers '*'- once match was found, will grab all text between specified params

/* Greedy quantifiers
   X? 	X, once or not at all
   X* 	X, zero or more times
   X+ 	X, one or more times
   X{n} 	X, exactly n times
   X{n,} 	X, at least n times
   X{n,m} 	X, at least n but not more than m times

Reluctant quantifiers
   X?? 	X, once or not at all
   X*? 	X, zero or more times
   X+? 	X, one or more times   */


public class regExDemoPt2 {

	public static void main(String[] args) {
		
		System.out.println("------------- Example 12: Greedy quantifiers -----------");
        
		String alphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
		 
		// 		X{n} 	- X, exactly n times
		// 		X+ 		- X, one or more times
		// 		X*		- X, zero or more times
		
		System.out.println(alphaNumeric.replaceAll("^abcDeee","--YYY--")); // old way
		System.out.println(alphaNumeric.replaceAll("^abcDe{3}","--YYY--")); // X{n}
		System.out.println(alphaNumeric.replaceAll("^abcDe+","--YYY--")); // X+
		System.out.println(alphaNumeric.replaceAll("^abcDe*","--YYY--")); // X*
		System.out.println();
		
		String alphaNumeric2 = "abcDF12Ghhiiiijkl99z";  // removed 'eee'
		System.out.println(alphaNumeric2.replaceAll("^abcDe{3}","--YYY--")); // X{n}
		System.out.println(alphaNumeric2.replaceAll("^abcDe+","--YYY--")); // X+
		System.out.println(alphaNumeric2.replaceAll("^abcDe*","--YYY--")); // X* <-- useful when chars are optional
		System.out.println();
		
		//   X{n,} 		- X, at least n times
		//   X{n,m} 	- X, at least n but not more than m times
		
		//  '{2,5}' preceding char has to occur between 2 and 5 times:
        System.out.println(alphaNumeric.replaceAll("^abcDe{2,5}","--YYY--"));
        //  '{2,5}' preceding char has to occur at least 2 times:
        System.out.println(alphaNumeric.replaceAll("^abcDe{2,}","--YYY--"));
        
        // combination of 1 or more 'h', 0 or more 'i' and 'j'
        System.out.println(alphaNumeric.replaceAll("h+i*j","--YYY--"));
		
        System.out.println("\n------------- Example 13: Pattern and Matcher classes-----------");
        
        // 13.) Find all occurrences of '<h2>' tag in a char sequence of HTML text 
        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        // How to check if a pattern exists inside text:
        // Note that '.' will match any char while '*' means 0 or more chars. 
		String h2Pattern = ".*<h2>.*";  // note that here we make the search pattern match the entire html text!!
		Pattern pattern = Pattern.compile(h2Pattern); // creating a Pattern instance for the search pattern
		Matcher matcher = pattern.matcher(htmlText); // creating a Matcher instance for the html text	
		System.out.println("h2Pattern contains <h2>: " + matcher.matches()); // checking whether the pattern matches the entire html text
		System.out.println();
		
		// In this example we want to find all occurrences of <h2> and where they are	
		String h2Pattern2 = "<h2>";  // here we are searching only for '<h2>'
		Pattern pattern2 = Pattern.compile(h2Pattern2);
		Matcher matcher2 = pattern2.matcher(htmlText);
	
		int count = 0;
		
		// find() looks for occurrences of the sequence inside html text that matches the pattern
		while (matcher2.find()) {
			count++;
			// start() returns the start index of the match, end() returns the end
			System.out.println("Occurrence of <h2> " + count + " : " + matcher2.start() + " to " + matcher2.end());
		}
		System.out.println();
		
		// Using groups to find occurrences of <h2>
		// We are using reluctant quantifier '*?' to ensure that extra text is not grabbed
		String h2GroupPattern = "(<h2>.*?</h2>)";  //  <-- We are using ( ) for groups
		Pattern groupPattern = Pattern.compile(h2GroupPattern); 
		Matcher groupMatcher = groupPattern.matcher(htmlText);
		
		System.out.println("h2Pattern contains <h2>: " + groupMatcher.matches());
		groupMatcher.reset(); // resetting the matcher, since we've used it above
		
		while (groupMatcher.find()) {
			System.out.println("Occurrence " + groupMatcher.group(1));
		}
		System.out.println();
		
		// Using 3 groups to get the texts between <h2> and </h2> tags without the tags themselved
		String h2TextGroups = "(<h2>)(.+?)(</h2>)";  //  <-- We are using ( ) for groups
		Pattern textPattern = Pattern.compile(h2TextGroups); 
		Matcher textMatcher = textPattern.matcher(htmlText);
		
		while (textMatcher.find()) {
			System.out.println("Occurrence " + textMatcher.group(2));
		}
		
		
		
		
		
	}

}
