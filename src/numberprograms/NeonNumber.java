package numberprograms;
import java.util.Scanner;
public class NeonNumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter starting range");
		int n=sc.nextInt();
		System.out.println("Enter end range");
		int m=sc.nextInt();
		
		for(int i=n;i<=m;i++)
		{
			int sum=0;
			int num=i;
			int sq=i*i;
			
			while(sq>0)
			{
				int rem=sq%10;
				sum=sum+rem;
				sq=sq/10;
			}
			if(sum==num)
			{
				System.out.println(i);
			}
		}
	}
}
