package createAccount;

public class DefaultBillingAddress {
	
	
	private String data;

	@Override
	public String toString() {
		return "DefaultBillingAddress [data=" + data + ", getData()=" + getData() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	public DefaultBillingAddress() {
		
	}
}
