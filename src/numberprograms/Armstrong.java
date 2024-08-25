package numberprograms;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		
		int num=n;
		int arm=0;
		
		while(n>0)
		{
			int rem=n%10;
			arm=(rem*rem*rem)+arm;
		    n=n/10;
		}
		if(num==arm)
		{
			System.out.println(num+" "+" is Armstrong number");
		}
		else
			System.out.println(num+" "+"is not Armstrong number");	
	}
}