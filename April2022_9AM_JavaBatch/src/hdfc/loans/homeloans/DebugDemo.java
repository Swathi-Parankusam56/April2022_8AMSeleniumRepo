package hdfc.loans.homeloans;

import java.util.Scanner;

public class DebugDemo 
{

	public int m1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int asize = sc.nextInt();
		int sum =0;
		
		int[] a = new int[asize];
			
		System.out.println("Enter the array Elements :");
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
			System.out.println("a["+i+"]=" + a[i]);
			sum = sum + a[i];
		}
		System.out.println("sum of array is :" +  sum);
		return sum;
	}
	
	public static void main(String[] args) 
	{
		DebugDemo obj = new DebugDemo();
		int count = obj.m1();
		System.out.println("count of aray is : " + count);
	}

}
