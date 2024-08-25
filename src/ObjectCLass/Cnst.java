package ObjectCLass;

public class Cnst {
	
	int a; int b;
	Cnst()
	{
		a=10; b=20;
	}
	void disp()
	{
		System.out.println(a+b);
	}
	public static void main(String[]args)
	{
		Cnst a=new Cnst();
		a.disp();
	}
}
