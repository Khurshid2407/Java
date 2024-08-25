package numberprograms;

public class Test1 extends Test{
	
	void show()
	{
		roll=2;name="Kd";percentage=89.4;
		System.out.println(roll+" "+name+" "+percentage);
	}
	public static void main(String[]args)
	{
		Test1 r=new Test1();
		r.disp();  r.show();
	}
}
