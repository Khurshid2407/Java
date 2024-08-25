package Arrays;
import java.util.Scanner;          /* Dynamic array */
public class C {
	
	public static void main(String[]args)
	{
		int size;      // Variable
		Scanner r=new Scanner(System.in);
		System.out.println("Enter size of Array");
		size=r.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter elements in array");
		for(int i=0;i<size;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Printed Array Elements");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}

}
