package numberprograms;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range");
		int n=sc.nextInt();
		System.out.println("Enter end range");
		int m=sc.nextInt();
		
		for(int i=n;i<=m;i++)
		{
			int arm=0;
			int num=i;
			for(int j=1;j<=i;j++)
			{
				while(num>0)
				{
					int rem=num%10;
					arm=(rem*rem*rem)+arm;
					num=num/10;
				}
			}
			if(num==arm)
			{
				System.out.println(num);
			}
		}
	}
}
