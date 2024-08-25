package ObjectCLass;

public class efg {
	
	efg()
	{
		this(2,"kd");
		System.out.println("No para const efg");
	}
	efg(int a)
	{
		System.out.println("int para const efg");
	}
	efg(String s)
	{
		System.out.println("string para const efg");
	}
	efg(int a , String s)
	{
		System.out.println("int and string para const efg");
	}
	public static void main(String[]args)
	{
		efg r=new efg();
	}
	
}

