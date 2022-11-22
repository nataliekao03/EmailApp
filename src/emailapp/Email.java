package emailapp;
import java.util.Scanner;
import java.util.Random;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private int defaultPasswordLength;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	//Constructor to receive first and last name
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Call a method asking for the department = return the department
		department = setDepartment();
		
		// Call a method to create random password
		defaultPasswordLength = 8;
		password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
	}
	
	// Ask for the department
	private String setDepartment()
	{
		System.out.print("New worker: " + firstName +  ". Deparment Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1)
		{
			return "sales";
		}
		else if(deptChoice == 2)
		{
			return "development";
		}
		else if(deptChoice == 3)
		{
			return "accounting";
		}
		else
		{
			return "";
		}
		
	}
	
	// Generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++)
		{
			int random = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity)
	{
		mailboxCapacity = capacity;
	}
	
	// Define an alternate email
	public void setAlternateEmail(String altEmail)
	{
		alternateEmail = altEmail;
	}
	// Change the password
	public void changePassword(String pwd)
	{
		password = pwd;
	}
	
	public int getMailboxCapacity()
	{
		return mailboxCapacity;
	}
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	public String getPassword()
	{
		return password;
	}
	public String printInfo()
	{
		return "Display name: " + firstName + " " + lastName + 
				"\nCompany email: " + email + 
				"\nMailbox capacity: " + mailboxCapacity;
	}
	

	
	

}

