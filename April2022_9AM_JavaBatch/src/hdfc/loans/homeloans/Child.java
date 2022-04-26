package hdfc.loans.homeloans;


class Parent
{
	
	public  Number workhard()
	{
		System.out.println("Parent : wake up early, goto college");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Parent : Atmost care");
	}
	
}

public class Child extends Parent
{

	public   Number workhard()
	{
		System.out.println("child : wake up anytime, goto movies");
		return 0;
	}
	
	public void love()
	{
		System.out.println("child : iam in love");
	}
	
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.workhard();
		c.care();
		c.love();
	}

}
