package createAccount;

public class CreateAccountRequest {
	
	
	
	private CreateAccountUser user;

	@Override
	public String toString() {
		return "CreateAccountRequest [user=" + user + ", getUser()=" + getUser() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public CreateAccountUser getUser() {
		return user;
	}

	public void setUser(CreateAccountUser user) {
		this.user = user;
	}
	
	
	

}
