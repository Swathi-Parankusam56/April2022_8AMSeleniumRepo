package hdfc.loans.carloans;

public abstract class AbstractClass 
{
	
	int x = 100;
	
	public void m1()
	{
		System.out.println("iam m1 concrete from AbstractClass");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) 
	{
		//AbstractClass obj = new AbstractClass();
		AbstractClass obj = new ChildClass();
		obj.m1();
		obj.m2();
	}

}
