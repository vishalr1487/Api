package createAccount;

public class DefaultShippingAddress {
	
	
	private String data;

	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "DefaultShippingAddress [data=" + data + ", getData()=" + getData() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public DefaultShippingAddress() {
		
	}


	
}
