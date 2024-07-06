package phoneBillCalculator2;

public class PhoneBillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBillObject phonebill = new PhoneBillObject();
		phonebill.setId(01);
		phonebill.setPlanCost(479);
		phonebill.setPlanMin(2000);
		phonebill.setUsedMin(2001);
		phonebill.printItemizedBill();

	}

}
