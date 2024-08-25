package ObjectCLass;

public class Abcd {
	void add()
	{
		int a=10 , b=20;
		int c=a+b;
		System.out.println(c);
	}
	void add(int x , int y)
	{
		int c=x+y;
		System.out.println(c);
	}
	void add(int z , double p)
	{
		double c=z+p;
		System.out.println(c);
	}
	public static void main(String[]args)
	{
		Abcd s=new Abcd();
		s.add();
		s.add(22,44);
		s.add(50,12.50);		
	}
}