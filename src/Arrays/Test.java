package Arrays;
import java.util.Scanner;
public class Test {
	
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=r.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Reverse of elements");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	}

}
