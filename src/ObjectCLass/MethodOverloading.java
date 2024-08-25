package ObjectCLass;

public class MethodOverloading {
	
	void Student(String name)
	{
		System.out.println(name);
	}
    void Student(int roll)
	{
		System.out.println(roll);
	}
    void Student(double percentage)
	{
		System.out.println(percentage);
	}
	public static void main(String[]args)
	{
		MethodOverloading sc=new MethodOverloading();
		
		sc.Student("kd");
		sc.Student(22);
		sc.Student(89.4);
	}
}
