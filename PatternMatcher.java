package patternmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		PatternMatcher patternMatcher = new PatternMatcher();
		String firstname = "isha";
		System.out.println(firstname+"------->"+patternMatcher.validateFirstname(firstname));
		String lastname = "Jounjalkar";
		System.out.println(lastname+"------->"+patternMatcher.validateLastname(lastname));
		String email = "abc.LYX@bl.co.com";
		System.out.println(email+"------->"+patternMatcher.validateEmail(email));
		String number = "91 1548846122";
		System.out.println("EmailId of User:"+number+"------->"+patternMatcher.validateMobileNum(number));
		String password = "Dklnd@_44";
		System.out.println("Password of User:"+password+"------->"+patternMatcher.validatePassword(password));
		String email1 = "abc@gmail.com";
		System.out.println(email1+"------->"+patternMatcher.validateEmail(email1));
		String email2 = "abc-100@yahoo.com";
		System.out.println(email2+"------->"+patternMatcher.validateEmail(email2));
		String email3 = "abc.100@yahoo.com";
		System.out.println(email3+"------->"+patternMatcher.validateEmail(email3));
		String email4 = "abc-100@abc.net";
		System.out.println(email4+"------->"+patternMatcher.validateEmail(email4));
		String email5 = "abc.100@abc.com.au";
		System.out.println(email5+"------->"+patternMatcher.validateEmail(email5));
		String email6 = "abc@gmail.com.com";
		System.out.println(email6+"------->"+patternMatcher.validateEmail(email6));
		String email7 = "abc@.com.my";
		System.out.println(email7+"------->"+patternMatcher.validateEmail(email7));
		String email8 = "abc123@gmail.a";
		System.out.println(email8+"------->"+patternMatcher.validateEmail(email8));
		String email9 = "abc123@.com";
		System.out.println(email9+"------->"+patternMatcher.validateEmail(email9));
		String email10 = ".abc@abc.com";
		System.out.println(email10+"------->"+patternMatcher.validateEmail(email10));
		String email11 = "abc()*@gmail.com";
		System.out.println(email11+"------>"+patternMatcher.validateEmail(email11));
		String email12 = "abc@%*.com";
		System.out.println(email12+"------>"+patternMatcher.validateEmail(email12));
		String email13 = "abc..2002@gmail.com";
		System.out.println(email13+"------->"+patternMatcher.validateEmail(email13));
		String email14 = "abc@abc@gmail.com";
		System.out.println(email14+"------->"+patternMatcher.validateEmail(email14));
	
	}

	private String validatePassword(String password) {
		String regex = "^([A-Za-z]{1})(?=.*[0-9])(?=.*\\d)(?=.*[@$!_%*#?&])[A-Za-z\\d@$!_%*#?&]{8,}$";
  	  Pattern pattern = Pattern.compile(regex);
  	  Matcher matcher = pattern.matcher(password);
  	  if(matcher.find()) {
  		  return "valid";
  		  
  	  }
  	  return "invalid";
		
	} 

	private String validateMobileNum(String number) {
		String regex = "^([0-9]{2}?[ ][0-9]{4,13})$";
  	  Pattern pattern = Pattern.compile(regex);
  	  Matcher matcher = pattern.matcher(number);
  	  if(matcher.find()) {
  		  return "valid";
  		  
  	  }
  	  return "invalid";
		
	}
	private String validateFirstname(String firstname) {
		String regex = "(^[A-Z]{1})[a-z]{2,}$";
  	  Pattern pattern = Pattern.compile(regex);
  	  Matcher matcher = pattern.matcher(firstname);
  	  if(matcher.find()) {
  		  return "valid";
  		  
  	  }
  	  return "invalid";
    }

	private String validateLastname(String lastname) {
		String regex = "(^[A-Z]{1})[a-z]{2,}$";
  	  Pattern pattern = Pattern.compile(regex);
  	  Matcher matcher = pattern.matcher(lastname);
  	  if(matcher.find()) {
  		  return "valid";
  		  
  	  }
  	  return "invalid";
    }
	
	
	
	private String validateEmail(String email) {
  	  String regex = "^[a-z]+[.|+_-]?[a-z0-9]+[@][a-z0-9]{1,}[.][a-z]{2,}[.]{0,1}[a-z]*$";
  	  Pattern pattern = Pattern.compile(regex);
  	  Matcher matcher = pattern.matcher(email);
  	  if(matcher.find()) {
  		  return "valid";
  		  
  	  }
  	  return "invalid";
    }
	
}
		
		
	



