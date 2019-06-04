package allExercises.ProjectCIF;


public class FormatPlaceOfBirth {

	// Want to return: City, Province, Country
	// If any of the fields is empty, return the rest of the fields separated by ", "
	
	public static void main(String[] args) {
		
		System.out.println(getPlaceOfBirthValue("Moscow", "Rus", "Russia")); // → Moscow, Rus, Russia
		
		System.out.println(getPlaceOfBirthValue("Moscow", "", "Russia")); // → Moscow, Russia
		System.out.println(getPlaceOfBirthValue("", "Rus", "Russia")); // → Rus, Russia
		System.out.println(getPlaceOfBirthValue("Moscow", "Rus", "")); // → Moscow, Rus
		
		System.out.println(getPlaceOfBirthValue("Moscow", "", "")); // → Moscow
		System.out.println(getPlaceOfBirthValue("", "Rus", "")); // → Rus
		System.out.println(getPlaceOfBirthValue("", "", "Russia")); // → Russia		
	}
 
	// shortest method
	public static String getPlaceOfBirthValue(String city, String province, String country) {
		return (city + ", " + province + ", " + country).replaceAll("^(, )*|( ,)|(, )*$", "");
	}	
	
	// solution without if's
	public static String getPlaceOfBirthValue3(String city, String province, String country) {
		StringBuilder sb = new StringBuilder();
		sb.append(city + ", ");
		sb.append(province + ", ");
		sb.append(country);	
		return sb.toString().replaceAll("^(, )*|( ,)|(, )*$", "");
	}	
	
	// long method with multiple if's
	public static String getPlaceOfBirthValue2(String city, String province, String country) {
			
		if (city.length() >= 1 && province.length() >= 1 && country.length() >= 1) {
			return city + ", " + province + ", " + country;
		} else if (city.length()>=1 && province.length()>=1) {
			return city + ", " + province;
		} else if (city.length()>=1 && country.length()>=1) {
			return city + ", " + country;
		} else if (province.length()>=1 && country.length()>=1) {
			return province + ", " + country;
		} else if (city.length() >= 1) {
			return city;
		} else if (province.length() >= 1) {
			return province;
		} else if (country.length() >= 1) {
			return country;
		}	
		return "";
	}	

}
