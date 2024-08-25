package Arrays;
import java.util.Scanner;
public class Maximum {
	
	public static void main(String[]args)
	{
		int max;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=r.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum number in array is"+" "+max);
	}
}

