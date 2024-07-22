package phoneBillCalculator;

import java.util.Scanner;

public class PhoneBill {
	
	//Global variable
	static Scanner scanner = new Scanner(System.in);
	static double overageRate = 0.25;
	static int taxRate = 15;
	
	
	public static void main(String arg[])
	{
		double planAmount = getPlan();
		double extraTime = getExtraTime();
		double overageFee = calculateOverage(extraTime);
		double tax= calculateTax(planAmount, overageFee);
		
		//Total bill amount
		double totalBill = planAmount + overageFee + tax;
		System.out.println("Phone Bill Statement \r\n Plan: $" +planAmount+ " \r\n Overage: $" +overageFee+" \r\n Tax: $" +tax+ " \r\n Total: $"+totalBill);
		scanner.close();
	}

	public static double getPlan()
	{
		System.out.println("Enter the your Plan amount");
		double planAmount = scanner.nextDouble();
		return planAmount;
	}
	
	public static double getExtraTime()
	{
		System.out.println("Enter the Extra time you used ");
		double extraTime = scanner.nextDouble();
		return extraTime;
	}
	
	public static double calculateOverage(double extraTimeUsed)
	{
		double overageCharge = overageRate*extraTimeUsed;
		return overageCharge;
	}
	
	public static double calculateTax(double planAmount, double overageFee)
	{
		double tax = ((planAmount+overageFee)*taxRate)/100;
		return tax;
	}
	
}
