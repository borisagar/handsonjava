package phoneBillCalculator2;

import java.util.Scanner;

public class PhoneBillObject {
	
	private int id;
	private double planCost;
	private double planMin;
	private double overageRate = 0.50;
	private double usedMin;
	public Scanner scanner = new Scanner(System.in);
	
	
	public void setId(int id) 
	{ 
		this.id = id;
	}
	public int getId() {return id;}
	
	public void setPlanMin(double planMin) 
	{
		this.planMin = planMin;
	}
	public double getPlanMin() {return planMin;}
	
	public void setPlanCost(double planCost) 
	{
		this.planCost = planCost;
	}
	public double getPlanCost() {return planCost;}
	
	public void setUsedMin(double usedMin) 
	{
		this.usedMin = usedMin;
	}
	public double getUsedMin() {return usedMin;}
	
	
	public PhoneBillObject() {
		id = 0;
		planCost = 479.00; 
		planMin = 800;
		usedMin = 800;
	}
	
	public PhoneBillObject(int id) {
		this.id = id;
		planCost = 479.00; 
		planMin = 800;
		usedMin = 800;
	}
	
	public PhoneBillObject(int id, double planCost, double planMin, double usedMin) {
		this.id = id;
		this.planCost = planCost;
		this.planMin = planMin;
		this.usedMin = usedMin;
	}
	
	public double calculateOverage() 
	{
		if(usedMin<=planMin) 
		{
			return 0;
		}
		else 
		{
			double overageAmount = (usedMin - planMin)* overageRate;
			return overageAmount;
		}
	}
	
	public double calculateTax()
	{
		double taxRate = 0.15;
		return taxRate* (planCost+ calculateOverage());
	}
	
	public double calculateTotalBill() 
	{
		double totalBill = planCost+ calculateTax() + calculateOverage(); 
		return totalBill;
	}
	
	public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + planCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotalBill()));
	}
	
	
	

}
