package createAccount;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes {
	
	
	private String email;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStore_credits() {
		return store_credits;
	}

	public void setStore_credits(int store_credits) {
		this.store_credits = store_credits;
	}

	public int getCompleted_orders() {
		return completed_orders;
	}

	public void setCompleted_orders(int completed_orders) {
		this.completed_orders = completed_orders;
	}

	@JsonProperty("store_credits")
	private int store_credits;
	
	@JsonProperty("completed_orders")
	private int  completed_orders;
	
	
	@Override
	public String toString() {
		return "Attributes [email=" + email + ", store_credits=" + store_credits + ", completed_orders="
				+ completed_orders + ", getEmail()=" + getEmail() + ", getStore_credits()=" + getStore_credits()
				+ ", getCompleted_orders()=" + getCompleted_orders() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

}
