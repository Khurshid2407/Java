package Arrays;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner r=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=r.nextInt();
		int a[]=new int [size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("Array Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum=a[i]+sum;
		}
		System.out.println("Sum of Array elements"+" "+sum);

	}

}
