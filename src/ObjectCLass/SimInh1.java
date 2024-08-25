package ObjectCLass;

public class SimInh1 extends SimInh {
	
	void disp()
	{
		name="Kd" ; roll= 12 ; percentage= 89.5 ;
		System.out.println(name+" "+roll+" "+percentage);
	}
	public static void main(String[]args)
	{
		SimInh1 r=new SimInh1();
		r.input(); r.disp();	
	}
}
