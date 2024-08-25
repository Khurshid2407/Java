package Arrays;
import java.util.Scanner;
public class Decending {
	
	public static void main(String[]args)
	{
		int temp=0;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=r.nextInt();
		int a[]=new int [size];
		System.out.println("Enter elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Converted array in Decending ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
