package ObjectCLass;

public class ParaCnst {
	int x,y;
	ParaCnst(int a,int b)
	{
		x=a; y=b;
	}
	void disp()
	{
		System.out.println(x+y);
	}
	public static void main(String[]args)
	{
		ParaCnst m=new ParaCnst(40,20);
		m.disp();
	}

}
