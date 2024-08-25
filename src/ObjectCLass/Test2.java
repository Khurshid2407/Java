package ObjectCLass;

public class Test2 { 
	
	public static void main(String[]args)
	{
		Test r=new Test1();// Upcasting
		Test1 s=(Test1)r;// Downcasting
		
		s.show();  s.disp();
	}
}
