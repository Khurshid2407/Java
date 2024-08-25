package Arrays;
import java.util.Scanner;
public class Prime {
	
	public static void main(String[]args)
	{
		int count=0;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=r.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Prime elements in array");
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}	
			if(count==2)
			{
				System.out.println(a[i]);
			}
		} 
	}
}