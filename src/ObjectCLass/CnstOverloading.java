package ObjectCLass;

public class CnstOverloading {
	
	int a ; double b ; String c ;
	CnstOverloading()
	{
		a=10 ; b=20.5 ; c="Kd";
		System.out.println(a+" "+b+" "+c);
	}
	CnstOverloading(int x, double y)
	{
	    a=x ; b=y ;
	    System.out.println(a+" "+b);
	}
	CnstOverloading(String s , int x)
	{
		c=s ; a=x ;
		System.out.println(c+" "+a);
	}
	public static void main(String[]args)
	{
		CnstOverloading r=new CnstOverloading();
		CnstOverloading r1=new CnstOverloading(12,30.5);
		CnstOverloading r2=new CnstOverloading("kd",50);
	}
}
