package Arrays;
import java.util.Scanner;
public class Reverse {
	
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=r.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements in array");
		for(int i=0;i<size;i++)
		{
			a[i]=r.nextInt();
		}
		
		System.out.println("Array elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Reverse array elements");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
