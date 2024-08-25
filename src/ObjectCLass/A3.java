package ObjectCLass;

public class A3 {
	
	public static void m1()
	{
		System.out.println("Static method");
	}
	void m2()
	{
		System.out.println("non static method");
	}
	public static void main(String[]args)
	{
		A3 r=new A3();
		{
			r.m1();   r.m2();
		}
	}

}
