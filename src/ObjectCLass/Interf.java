package ObjectCLass;

public class Interf implements Interface , Interface1{
	
	public void show()
	{
		System.out.println("Interface");
	}
	public void disp()
	{
		System.out.println("Interface1");
	}
	public static void main(String[]args)
	{
		Interf r=new Interf();
		r.show();  r.disp();
	}
	
}
