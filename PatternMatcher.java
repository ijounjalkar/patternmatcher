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
		
		
	



