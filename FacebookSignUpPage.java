
package LoginPageAutomation;

public class FacebookSignUpPage extends UtilitiesFunctions {
	
	public void userFirstName(String stringFirstName) {
		
		System.out.println("Enter the Name: " +stringFirstName);
		
		}
	public void userLastName(String stringLastName) {
		
		System.out.println("Enter the Name: " +stringLastName);
	}

	public void userMobileNumber(String stringMobileNumber) {
		System.out.println("Set the Mobile Number " +stringMobileNumber );
	}
		
	public void userPassword (String stringGetPassword) {
		
		System.out.println("Password is " +stringGetPassword);
	} 

	public void getDateOfBirth(String strDate) {
		
		System.out.println("User Date of Birth " +strDate);
	}
	
	public void getmonthofUserDOB(String strMonth) {
		
		System.out.println("User Month of Birth " +strMonth);
	}
	
	public void getYearofUserDOB(String strYear) {
		
		System.out.println("User Year of Birth " +strYear);
	}

	public void getUserGender(String strGender) {
		System.out.println("User Gender is " +strGender);
	}
}
