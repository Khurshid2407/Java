package ObjectCLass;

public class Abc {
	int a;  
	String name;
	public Abc()//Constructor
	{
		a=0 ; name="Null";
	}
	void show()
	{
		System.out.println(a+" "+name);
	}
    public static void main(String[]args)
    {
    	Abc r=new Abc();
    	r.show();
    }
}
