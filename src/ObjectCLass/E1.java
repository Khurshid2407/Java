package ObjectCLass;

public class E1 {
	
	private int price;
	
	public void setValue(int a)
	{
		price=a;
	}
	public int getValue()
	{
		return price;
	}
	public static void main(String[]args)
	{
		E1 r=new E1();
		{
			r.setValue(11000);
			System.out.println(r.getValue());
		}
	}
}
