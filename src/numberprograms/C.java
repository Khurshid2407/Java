package numberprograms;

public class C implements A,B{
	public void show()
	{
		System.out.println("Interface A");
	}
	public void disp()
	{
		System.out.println("Interface B");
	}
	public static void main(String[]args)
	{
		C r=new C();
		r.show();   r.disp();
	}
}
