package numberprograms;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range");
		int n=sc.nextInt();
		System.out.println("End range");
		int m=sc.nextInt();
		int count=0;
		for(int i=n;i<=m;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
}
