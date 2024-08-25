package numberprograms;

public class Lion extends Animal {
	
	Lion()
	{
		super();
	}
	public void sound()
	{
		System.out.println("Roar");
	}
	public static void main(String[]args)
	{
		Dog d=new Dog();
		Lion l=new Lion();
		
		d.sound();  l.sound();
	}

}
