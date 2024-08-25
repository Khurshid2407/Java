package numberprograms;
import java.util.Scanner;
public class Neon {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		int num=n;
		int sq= n*n;
		int sum=0;
		
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(sum==num)
		{
			System.out.println(num+" "+"is neon number");
		}
		else
			System.out.println(num+" "+"is not neon number");	
	}
}