package ObjectCLass;

public class MultiLevInh {
	
	int a , b , c;
	void add()
	{
		a=10 ; b=20;
		c=a+b;
		System.out.println("Addition of two number"+c);
	}
}
class B extends MultiLevInh
{
	void sub()
	{
		a=40 ; b=20 ;
		c=a-b;
		System.out.println("Subtraction of two number"+c);
	}
}
class C extends B
{
	void mult()
	{
		a=10 ; b=20 ;
		c=a*b;
		System.out.println("Multiple of two number"+c);
	}
}
class Driver
{
	public static void main(String[]args)
	{
		C r=new C();
		
		r.add(); r.sub(); r.mult();
	}
}
