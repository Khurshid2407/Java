package ObjectCLass;

public class CarDetails {
	
	String brand;
	int price;
	int milege;
	String colour;
	
	public static void main(String[]args)
	{
		CarDetails c1=new CarDetails();
		c1.brand="Mahindra";
		c1.price=1500000;
		c1.milege=20;
		c1.colour="White";
		
		System.out.println("Car 1 Details");
		System.out.println(c1.brand);
		System.out.println(c1.price);
		System.out.println(c1.milege);
		System.out.println(c1.colour);
		
		CarDetails c2=new CarDetails();
		c2.brand="Maruti Suzuki";
		c2.price=500000;
		c2.milege=25;
		c2.colour="Gray";
		
		System.out.println("Car 2 Details");
		System.out.println(c2.brand);
		System.out.println(c2.price);
		System.out.println(c2.milege);
		System.out.println(c2.colour);
		
		CarDetails c3=new CarDetails();
		c3.brand="Toyota";
		c3.price=1400000;
		c3.milege=15;
		c3.colour="Silver";
		
		System.out.println("Car 3 Details");
		System.out.println(c3.brand);
		System.out.println(c3.price);
		System.out.println(c3.milege);
		System.out.println(c3.colour);
	}

}
