package hdfc.loans.homeloans;

public class Calculation 
{
	int a,b,c;

	public Calculation(int a, int b) 
	{
		super();
		this.a = a;
		this.b = b;
	}
	
	public void add()
	{
		c = a+b;
		System.out.println("Add  : " +  c);
	}
	
	public void sub()
	{
		c = a-b;
		System.out.println("Sub  : " +  c);
	}
	
	public static void main(String[] args) 
	{
		Calculation obj = new Calculation(10,20);
		obj.add();
		obj.sub();
		
		Calculation obj1 = new Calculation(1,2);
		obj1.add();
		obj1.sub();
	}

}
