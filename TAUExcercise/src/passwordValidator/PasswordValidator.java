package passwordValidator;

import java.util.Scanner;

public class PasswordValidator 
{
	public static void main(String arg[]) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Username");
		String username = input.next();
		
		System.out.println("Enter your old Password:");
		String oldPassword = input.next();
		
		System.out.println("Enter your New password:");
		
		String errorMessage = "";
		boolean isIncorrectPassword = true;
		
		while(isIncorrectPassword)
		{
			//Enter your new password again
			String newPassword = input.next();
			
			if(oldPassword == newPassword)
			{
				errorMessage += "\n Your New password cant be same as old password";
				isIncorrectPassword = true;
			}
			if(newPassword.toUpperCase().contains(username.toUpperCase()))
			{
				errorMessage += "\n Your New password cant be same as your username";
				isIncorrectPassword = true;
			}
			if(newPassword.length()<8)
			{
				errorMessage += "\n Your password should have min 8 char";
				isIncorrectPassword = true;
			}		
			if(newPassword.equals(newPassword.toLowerCase()))
			{
				errorMessage += "\n Your new password should have at least one uppercase latter";
				isIncorrectPassword = true;
			}
			if(newPassword.matches("[a-zA-Z0-9 ]*"))
			{
				errorMessage += "\n Your New password should have at least one special char";
				isIncorrectPassword = true;
			}
			
			System.out.println(errorMessage + "\n please enter your new password again !");
		}
		input.close();
	}
	
	

	
}
