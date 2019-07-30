package allExercises.ProjectCIF;


public class FormatCustomerType {

	// Want to return customer Type in English or Spanish 
	
	public static void main(String[] args) {
		
		System.out.println(getCustomerTypeValue(true, "I")); // → Individual
		System.out.println(getCustomerTypeValue(true, "B")); // → Business
		System.out.println(getCustomerTypeValue(false, "I")); // → Ind_In_Spanish
		System.out.println(getCustomerTypeValue(false, "B")); // → Busi_In_Spanish
		
		System.out.println(getCustomerTypeValue(false, "")); // → ?
	
	}
 
	public static String getCustomerTypeValue(Boolean ind, String customerTypeCode) {	
		if (ind) {
			if (customerTypeCode.contains("I")) {
				return "Individual";
			}
			return "Business";		
		}
		if (customerTypeCode.contains("I")) {
			return "Ind_In_Spanish";
		} 
		return "Busi_In_Spanish";
	}	
	
}
