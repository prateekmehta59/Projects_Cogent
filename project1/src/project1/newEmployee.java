package project1;

import java.security.SecureRandom;
import java.util.Arrays;

public class newEmployee {
	private String firstName;
	private String lastName;
//	private String email;
	private String altEmail;
	private Integer mailboxCapacity;
	private String password;
	private static Integer passwordLen = 6;
	private String department;
	private static String company = "XYZ";
	
	static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static SecureRandom rnd = new SecureRandom();
	
	public newEmployee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		if (Arrays.asList("sales", "development", "accounting").contains(department.toLowerCase())) {
			this.department = department;
		} else {
			this.department = "";
		}
	}

	public String newEmail() {
		if (department.equals("")){
			return firstName+ "." + lastName + "@" + company + ".com";
		} else {
			return firstName+ "." + lastName + "@" + department + "." + company + ".com";
		}
	}
	
	public String newPassword() {
		StringBuilder sb = new StringBuilder( passwordLen );
		   for( int i = 0; i < passwordLen; i++ ) 
		      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		   return sb.toString();
	}
	
	public String getEmail() {
		return this.newEmail();
	}


//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//


	public String getAltEmail() {
		return altEmail;
	}

	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}

	
	public Integer getMailboxCapacity() {
		return mailboxCapacity;
	}

	public void setMailboxCapacity(Integer mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}

	
	public String getPassword() {
		return this.newPassword();
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
