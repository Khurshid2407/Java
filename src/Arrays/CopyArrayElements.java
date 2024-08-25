package Arrays;

import java.util.Scanner;

public class CopyArrayElements {
	
	public static void main(String[]args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=r.nextInt();
		int a[]=new int [size];
		int b[]=new int [size];
		
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=r.nextInt();
		}
		System.out.println("First Array elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Copy Array elements");
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]);
		}
	}

}
