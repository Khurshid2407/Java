package Arrays;
import java.util.Scanner;
public class Odd {

	public static void main(String[] args) {
		
		Scanner r=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=r.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Odd elements present in array");
		for(int b:a)
		{
			if(b%2!=0)
			{
				System.out.println(b);
			}
		}

	}
}
