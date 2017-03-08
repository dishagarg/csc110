import java.util.Scanner;
import java.util.regex.Pattern;

public class L3Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a password (at least 8 chars, a digit, an uppercase and a lowercase): ");
		String password = sc.next();

	    Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
	    Pattern lowerCasePatten = Pattern.compile("[a-z ]");
	    Pattern digitCasePatten = Pattern.compile("[0-9 ]");

		if(password.length()>=8 && UpperCasePatten.matcher(password).find() && lowerCasePatten.matcher(password).find() && digitCasePatten.matcher(password).find()){
			System.out.println("Good Password!");
		}
	    if (password.length() < 8) {
	    	System.out.println("Password length must have atleast 8 character !!");
	    }
	    if (!UpperCasePatten.matcher(password).find()) {
	    	System.out.println("Password must have atleast one uppercase character !!");
	    }
	    if (!lowerCasePatten.matcher(password).find()) {
	    	System.out.println("Password must have atleast one lowercase character !!");
	    }
	    if (!digitCasePatten.matcher(password).find()) {
	    	System.out.println("Password must have atleast one digit character !!");
	    }
	}
}
