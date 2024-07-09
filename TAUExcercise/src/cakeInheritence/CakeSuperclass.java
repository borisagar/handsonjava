package cakeInheritence;

public class CakeSuperclass 
{
	private String flavor;
	private double price;
	
	
	public CakeSuperclass(String flavor) {
		setFlavor(flavor);
		setPrice(600);
	}
	
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}

	
	public String getFlavor() 
	{
		return flavor;
	}
	public void setFlavor(String flavor)
	{
		this.flavor = flavor;
	}

}
