package com.restApiTraining.pojo.CreateAccount;

public class DefaultBillingAddress {
	
	private String data;

	@Override
	public String toString() {
		return "DefaultBillingAddress [data=" + data + "]";
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
		
	}

}
