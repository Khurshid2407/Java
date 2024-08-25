package numberprograms;
import java.util.Scanner;
public class Perfect {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		int sum=0;
		int num=n;
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+" "+"is perfect number");
		}
		else
			System.out.println(num+" "+"is not perfect number");
	}

}
