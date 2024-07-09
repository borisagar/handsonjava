package cakeInheritence;

public class CakeOrder {

	public static void main(String[] args) 
	{
		
		CakeSuperclass cake = new CakeSuperclass("chocolate");
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake("Almond");
        birthdayCake.setPrice(49.95);
        birthdayCake.setCandles(4);
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake + candles: " + birthdayCake.getCandles());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake("Strawbarry");
        weddingCake.setTiers(2);
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake tiers: " + weddingCake.getTiers());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
	}

}
