package numberprograms;
import java.util.Scanner;
public class SpyNumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range");
		int n=sc.nextInt();
		System.out.println("Enter end range");
		int m=sc.nextInt();
		
		for(int i=n;i<=m;i++)
		{
			int num=i;
			int sum=0;
			int prod=1;
			
			while(num>0)
			{
				int rem=num%10;
				sum=sum+rem;
				prod=prod*rem;
				num=num/10;
			}
			if(sum==prod)
			{
				System.out.println(i);
			}
		}
	}
}
