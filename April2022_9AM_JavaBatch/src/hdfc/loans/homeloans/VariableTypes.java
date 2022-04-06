package hdfc.loans.homeloans;

public class VariableTypes 
{
	//primitive variable
	int x = 100;  // instance (or) non-static (or) instance-Global variable
	static float roi = 8.5f; // static (or) static-global variable
	
	public void m1()
	{
		int y =20; // local variable
		System.out.println(y);
		System.out.println(x);
		System.out.println(VariableTypes.roi);
	}
	
	
	public static void m2()
	{
		VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.roi);
	}
	
	public static void main(String[] args) 
	{
		VariableTypes obj = new VariableTypes();// non-primitive/reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.roi);		
	}

}
