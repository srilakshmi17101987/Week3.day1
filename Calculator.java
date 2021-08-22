package Showinheritance;

public class Calculator {
	
	public void add(int arg1,int arg2)
	{
		int x=arg1,y=arg2;
		System.out.println("The sum of 2 numbers"+(x+y));
		
	}
	public void add(int arg1,int arg2,int arg3)
	{
		int x=arg1,y=arg2;
		int z=arg3;
		System.out.println("The sum of 3 numbers"+(x+y+z));
		
	}
	public void Subtract(int arg1,int arg2)
	{
		int x=arg1,y=arg2;
		System.out.println("The subtraction of 2 numbers"+(x-y));
		
	}
	public void subtract(int arg1,int arg2,int arg3)
	{
		int x=arg1,y=arg2;
		int z=arg3;
		System.out.println("The subtraction of 3 numbers"+(x-y-z));
		
	}
	public void multiply(int arg1,int arg2)
	{
		int x=arg1,y=arg2;
		System.out.println("The multiplication of 2 numbers"+(x*y));
	}
	public void multiply(int arg1,int arg2,int arg3)
	{
		int x=arg1,y=arg2;
		int z=arg3;
		System.out.println("The multiplication of 3 numbers"+(x*y*z));
		
		
	}
	public void divide(int arg1,int arg2)
	{
		int x=arg1,y=arg2;
		System.out.println("The division of 2 numbers"+(x%y));
		
	}
	public void divide(float arg1,float arg2)
	{
		float x=arg1,y=arg2;
		
		System.out.println("The division of 2 numbers"+(x%y));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		obj.add(12, 10);
		obj.add(10, 20, 30);
		obj.Subtract(30, 780);
		obj.subtract(30, 45, 80);
		obj.multiply(20, 10);
		obj.multiply(10, 20, 30);
		obj.divide(20, 56);
		obj.divide(435.5f, 34f);

	}

}
