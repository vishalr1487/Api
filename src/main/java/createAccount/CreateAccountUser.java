package createAccount;

public class CreateAccountUser {
	
	
	private String email;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword_confirmation() {
		return password_confirmation;
	}
	public void setPassword_confirmation(String password_confirmation) {
		this.password_confirmation = password_confirmation;
	}
	private String password;
	private String password_confirmation;
	
	@Override
	public String toString() {
		return "CreateAccountUser [email=" + email + ", password=" + password + ", password_confirmation="
				+ password_confirmation + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getPassword_confirmation()=" + getPassword_confirmation() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	public CreateAccountUser() {
		
	}
	
	public CreateAccountUser(String email, String password, String password_confirmation) {
		super();
		this.email = email;
		this.password = password;
		this.password_confirmation = password_confirmation;
	}
	
	
	

}
