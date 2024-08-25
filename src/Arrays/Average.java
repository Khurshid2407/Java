package Arrays;
import java.util.Scanner;
public class Average {
	
	public static void main(String[]args)
	{
		int sum=0;  int avg=0;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter size of array");
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
			sum=a[i]+sum;
		}
		avg=sum/size;
		System.out.println("sum"+" "+sum+" "+"avg"+" "+avg);
	}

}
