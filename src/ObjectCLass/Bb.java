package ObjectCLass;

public class Bb extends Aa{
	
	Bb()
	{
		super("kd");
		System.out.println("No parametarised constructor");
	}
	Bb(String s)
	{
		super(10);
		System.out.println("string para constructor");
	}
}
