package e;

public class UserRegistration {
	
	public void registerUser(String username,String userCountry)
			throws InvalidCountryException {
		if(userCountry.equals("india")) {
			System.out.println("successful registration of user");
		}else
			throw new InvalidCountryException("invalid country name : "+
		userCountry+" please provide india");
	}
}
