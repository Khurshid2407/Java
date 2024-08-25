package numberprograms;
import java.util.Scanner;
public class Spy {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		int prod=1;
		int sum=0;
		int num=n;
		
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			prod=prod*rem;
			n=n/10;
		}
		if(sum==prod)
		{
			System.out.println(num+" "+"is spy number");
		}
		else
			System.out.println(num+" "+" is not spy number");
	}
}