package dayOfWeekArrey;

import java.util.Scanner;

public class DayOfWeek {

	
	public static void main(String arg[])
	{
		System.out.println("Enter the index of weekdays should be 1-7");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		if(day<1 || day>7)
		{
			System.out.println("Please enter valid input");
		}
		else
		{
			String dayText = dayofWeek(day);
			System.out.println("Number "+ day+ " day of week is "+dayText);
		}
		scanner.close();
		
	}
	
	public static String dayofWeek(int day) 
	{
		String[] daysofWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		return daysofWeek[day-1]; 
	}
}
