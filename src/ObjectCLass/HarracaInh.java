package ObjectCLass;

class HarracaInh {
	
	void disp()
	{
		System.out.println("What is your name");
	}
}
class B extends HarracaInh
{
	void show()
	{
		System.out.println("My name is kd");
	}
}
class C extends HarracaInh
{
	void show()
	{
		System.out.println("My name is Khurshid");
	}
}


class driv{
	  public static void main(String[]args){
			B r=new B();
			C r1=new C();
			
			r.disp(); r.show();
			r1.disp(); r1.show();
		
	}
}
