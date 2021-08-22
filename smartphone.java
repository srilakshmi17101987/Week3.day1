package Showinheritance;

public class smartphone extends Android {
	
	public void connectwhatsapp()
	{
		System.out.println("This is to connect whatsapp");
	}
 
	@Override
	public void takeVideo() {
		// TODO Auto-generated method stub
		//super.takeVideo();
		System.out.println("method overriding - smartphone");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartphone smartobj=new smartphone();
		smartobj.takeVideo();
		Android name = new Android();
name.takeVideo();
	}

}
