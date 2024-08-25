package ObjectCLass;

public class A1 {
	
	int a=10;
	static int b=20;
	static void show()
	{
		System.out.println(b);
	}
	void disp()
	{
		System.out.println(a+" "+b);
	}
	public static void main(String[]args)
	{
		A1 r=new A1();
		r.show(); r.disp();
	}
}
