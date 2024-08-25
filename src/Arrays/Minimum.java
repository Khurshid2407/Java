package Arrays;
import java.util.Scanner;
public class Minimum {
	
	public static void main(String[]args)
	{
		int min;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=r.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Minimum number in array is "+min);
	}
}
