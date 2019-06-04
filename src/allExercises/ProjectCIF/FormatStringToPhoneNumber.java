package allExercises.ProjectCIF;

public class FormatStringToPhoneNumber {

	public static void main(String[] args) {
		
		System.out.println(formatPhoneNum("0")); // → ""
		System.out.println(formatPhoneNum(null)); // → ""
		
		System.out.println(formatPhoneNum("71234567890")); // → 7 (123) 456-7890
		System.out.println(formatPhoneNum("1234567890")); // → (123) 456-7890
		
		System.out.println(formatPhoneNum("234567890")); // → (23) 456-7890
		System.out.println(formatPhoneNum("34567890")); // → (3) 456-7890
		
		System.out.println(formatPhoneNum("4567890")); // → 456-7890
		System.out.println(formatPhoneNum("567890")); // → 56-7890
		System.out.println(formatPhoneNum("67890")); // → 6-7890
		
		System.out.println(formatPhoneNum("7890")); // → 7890
		System.out.println(formatPhoneNum("890")); // → 890
		System.out.println(formatPhoneNum("90")); // → 90
		System.out.println(formatPhoneNum("1")); // → 1		
	}
 
	public static String formatPhoneNum(String phone) {	
		try {
			if (phone.equals(null)) {
				System.out.println("AS400 phone number field has a null value");
			} 
		} catch (NullPointerException e) {
			return "";	
		}
		if (phone.equals("0")) {
			System.out.println("AS400 phone number field has a zero value");
			return "";
		} else if (phone.length() == 11) {
			return phone.replaceFirst("(\\d{1})?(\\d{3})(\\d{3})(\\d{4})", "$1 ($2) $3-$4");
		} else if (phone.length() >= 8 && phone.length() <= 10) {
			return phone.replaceFirst("(\\d{1,3})(\\d{3})(\\d{4})", "($1) $2-$3");
		} else if (phone.length() >= 5 && phone.length() <= 7) {
			return phone.replaceFirst("(\\d{1,3})(\\d{4})", "$1-$2");
		}
		return phone;
	}
}
