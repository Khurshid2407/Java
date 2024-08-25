package Arrays;
import java.util.Scanner;
public class SearchElement {

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
		System.out.println("Array elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter search elements");
		int n=r.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				 count++;
			}
		}
		if(count>0)
		{
			System.out.println("Array found");
		}
		else
			System.out.println("Array not found");		
	}
}
