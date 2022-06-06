package LoginPageAutomation;


public class TestFacebookLoginPage {

	public static void main(String[] args) {
		
		FacebookSignUpPage objFaceBookLogin = new FacebookSignUpPage();
		UtilitiesFunctions objUtility = new UtilitiesFunctions();
		
		objFaceBookLogin.userFirstName(objUtility.getName(5));
		objFaceBookLogin.userFirstName(objUtility.getName(7));
		
		objFaceBookLogin.userMobileNumber(objUtility.getMobileNumber(9));
	
		objFaceBookLogin.userPassword(objUtility.getPassword(10));
		
		objFaceBookLogin.getDateOfBirth(objUtility.getDate());
		
		objFaceBookLogin.getmonthofUserDOB(objUtility.getMonth());
		
		objFaceBookLogin.getYearofUserDOB(objUtility.getRandomYear());
		
		objFaceBookLogin.getUserGender(objUtility.getRandomGender());
				
	}

}
