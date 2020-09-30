package patternmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
	public static void main(String[] args) {
		PatternMatcher patternMatcher = new PatternMatcher();
		String firstname = "Isha";
		System.out.println(firstname+"------->"+patternMatcher.validateInput(firstname));
		String lastname = "Jounjalkar";
		System.out.println(lastname+"------->"+patternMatcher.validateInput(lastname));
		String email = "abc.xyz@capg.co.in";
		System.out.println(email+"------->"+patternMatcher.validateInput(email));
		String number = "91 1548846122";
		System.out.println("EmailId of User:"+number+"------->"+patternMatcher.validateMobileNum(number));
		String password = "Dklnd@_44";
		System.out.println("Password of User:"+password+"------->"+patternMatcher.validatePassword(password));
	
	}

	private String validatePassword(String password) {
		String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!_%*#?&])[A-Za-z\\d@$!_%*#?&]{8,}$";
  	  Pattern pattern = Pattern.compile(regex);
  	  Matcher matcher = pattern.matcher(password);
  	  if(matcher.find()) {
  		  return "valid";
  		  
  	  }
  	  return "invalid";
		
	} 

	private String validateMobileNum(String number) {
		String regex = "^([0-9]{1,5}[ ][0-9]{1,10})$";
  	  Pattern pattern = Pattern.compile(regex);
  	  Matcher matcher = pattern.matcher(number);
  	  if(matcher.find()) {
  		  return "valid";
  		  
  	  }
  	  return "invalid";
		
	}

	private String validateInput(String firstname) {
		String regex = "^[A-Z a-z]{3,25}$";
  	  Pattern pattern = Pattern.compile(regex);
  	  Matcher matcher = pattern.matcher(firstname);
  	  if(matcher.find()) {
  		  return "valid";
  		  
  	  }
  	  return "invalid";
    }
	private String validateEmail(String email) {
  	  String regex = "^(abc[.][A-Za-z]+@bl[.]co[.][A-Za-z]{3,25})$";
  	  Pattern pattern = Pattern.compile(regex);
  	  Matcher matcher = pattern.matcher(email);
  	  if(matcher.find()) {
  		  return "valid";
  		  
  	  }
  	  return "invalid";
    }
	
}
		
		
	



