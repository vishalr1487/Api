package createAccount;

public class CreateAccountResponse {
	
	
	private Data data;

	@Override
	public String toString() {
		return "CreateAccountResponse [data=" + data + ", getData()=" + getData() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	

}
