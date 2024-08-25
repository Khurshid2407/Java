package ObjectCLass;

public class MobileDetails {
	String brand;
	int price;
	double screensize;
	int RAM;
	
	public static void main(String[]args)
	{
		MobileDetails m1=new MobileDetails();
		m1.brand="Samsung";
		m1.price=10000;
		m1.screensize=5.4;
		m1.RAM=6;
		
		System.out.println("Mobile 1 Details");
		System.out.println(m1.brand);
		System.out.println(m1.price);
		System.out.println(m1.screensize);
		System.out.println(m1.RAM);
		
		MobileDetails m2=new MobileDetails();
		m2.brand="Oppo";
		m2.price=15000;
		m2.screensize=6.2;
		m2.RAM=8;
		
		System.out.println("Mobile 2 Details");
		System.out.println(m2.brand);
		System.out.println(m2.price);
		System.out.println(m2.screensize);
		System.out.println(m2.RAM);
		
		MobileDetails m3=new MobileDetails();
		m3.brand="Nokia";
		m3.price=20000;
		m3.screensize=5.5;
		m3.RAM=6;
		
		System.out.println("Mobile 3 Details");
		System.out.println(m3.brand);
		System.out.println(m3.price);
		System.out.println(m3.screensize);
		System.out.println(m3.RAM);
		
		MobileDetails m4=new MobileDetails();
		m4.brand="Poco";
		m4.price=22000;
		m4.screensize=6.6;
		m4.RAM=8;
		
		System.out.println("Mobile 4 Details");
		System.out.println(m4.brand);
		System.out.println(m4.price);
		System.out.println(m4.screensize);
		System.out.println(m4.RAM);
	}

}
