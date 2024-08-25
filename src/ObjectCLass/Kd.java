                                         //ConstructorOverloading.
package ObjectCLass;        

public class Kd {
	int a ; double b ; String c;
	Kd()
	{
		a=10 ; b=20.40 ; c="Kd";
	}
	Kd(int x)
	{
		a=x;
	}
	Kd(double y, String z)
	{
		b=y ; c=z;
	}
	public static void main(String[]args)
	{
		Kd r=new Kd();
		Kd r1=new Kd(100);
		Kd r2=new Kd(50.20 ,"Khurshid");
		System.out.println(r.a+" "+r.b+" "+r.c);
		System.out.println(r1.a);
		System.out.println(r2.b+" "+r2.c);
		
	}
}