package com.restApiTraining.pojo.CreateAccount;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Relationships {
	
	
	@JsonProperty("default_billing_address")
	private String default_billing_address;
	

	@Override
	public String toString() {
		return "Relationships [default_billing_address=" + default_billing_address + ", default_shipping_address="
				+ default_shipping_address + "]";
	}


	public String getDefault_billing_address() {
		return default_billing_address;
	}


	public void setDefault_billing_address(String default_billing_address) {
		this.default_billing_address = default_billing_address;
	}


	public String getDefault_shipping_address() {
		return default_shipping_address;
	}


	public void setDefault_shipping_address(String default_shipping_address) {
		this.default_shipping_address = default_shipping_address;
	}


	@JsonProperty("default_shipping_address")
	private String default_shipping_address;
	
	
	
}
