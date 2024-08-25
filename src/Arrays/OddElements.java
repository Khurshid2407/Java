package Arrays;

public class OddElements {
	
	public static void main(String[]args)
	{
		int a[]= {23,44,35,76,99,63,29};
		
		for(int i:a)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
