package com.qapitol.training.pojo;

public class CreateAccountMainClass {
	

	private static String reqCreateAccountBody = "{\n"
			+ " \"user\": {\n"
			+ "   \"email\": \"vinay789@gmail.com\",\n"
			+ "   \"password\": \"123456\",\n"
			+ "   \"password_confirmation\": \"123456\"\n"
			+ " }\n"
			+ "}";
	
	

	public static void main(String[] args) {

		CreateAccountRequest  car = new CreateAccountRequest();
		car.setEmail("vinay789@gmail.com");
		car.setPassword("123456");
		car.setPassword_confirmation("123456");
		
		
		System.out.println("CREATE ACCOUNT API" + car);
		
		
		
	}

}
