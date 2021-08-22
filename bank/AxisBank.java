package org.bank;

public class AxisBank  extends BankInfo{
	public void deposit()
	{
		System.out.println("This is axisbank account - current deposit account");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank axisobj= new AxisBank();
		BankInfo Bankobj=new BankInfo();
		axisobj.deposit();
		axisobj.fixed();
		axisobj.saving();
		//override methods will not display in the list for the child class objects
		Bankobj.deposit();
		

	}

}
