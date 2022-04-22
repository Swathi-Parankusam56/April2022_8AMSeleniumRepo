package hdfc.loans.carloans;

import java.util.Date;

public abstract  class A 
{
	int x = 10; 
	public final static int y = 20;
	
	abstract void m6();
	
	public  void m1()
	{
		 int z =30;
		
		System.out.println("iam m1 from A");
		System.out.println(x);
		x = 100;
		System.out.println(x);
		
		y=200;
		System.out.println(y);
		
		z=300;
		System.out.println(z);
		
	}
	
	static
	{
		System.out.println("iam static Block");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}

	public static void main(String[] args)
	{
		A a = new A();
		a.m1();
	}
	
	

}
