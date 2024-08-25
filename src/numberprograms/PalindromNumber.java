package numberprograms;
import java.util.Scanner;
public class PalindromNumber
{
	public static void main(String[]args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter starting range");
	   int num1=sc.nextInt();
	   System.out.println("Enter end range");
	   int num2=sc.nextInt();
	   
	   for(int i=num1;i<=num2;i++)
	   {
		   int rev=0;
		   int n=i;
		   while(n>0)
		   {
			   int rem=n%10;
			   rev=rev*10+rem;
			   n=n/10;
		   }
		   if(rev==i)
		   {
			   System.out.println(i);
		   }
	   }
	}
}