package numberprograms;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range");
		int n=sc.nextInt();
		System.out.println("Enter end range");
		int m=sc.nextInt();
		
		for(int i=n;i<m;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}

}
