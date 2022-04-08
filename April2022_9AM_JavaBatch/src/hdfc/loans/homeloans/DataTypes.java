package hdfc.loans.homeloans;

public class DataTypes 
{
	byte b; // 1 byte
	short s; // 2 byte
	int x; //4 bytes
	long l; //8 bytes
	
	float f; // 4 bytes
	double d; // 8 bytes
	
	char ch; // 2 bytes
	boolean bb;
	
	String str;
	static String cname;
	static float roi;
	
	
	public static void main(String[] args) 
	{
		int i = 10;
		
		DataTypes obj = new DataTypes();
		System.out.println("Byte :"+ obj.b);
		System.out.println("short :"+ obj.s);
		System.out.println("Int :"+ obj.x);
		System.out.println("Long :"+ obj.l);
		
		System.out.println("Float :"+ obj.f);
		System.out.println("Double :"+ obj.d);
		
		System.out.println("Char :"+ obj.ch);
		System.out.println("Bolean :"+ obj.bb);
		
		System.out.println("String :"+ obj.str);
		
		System.out.println("Cname :" +  cname);
		System.out.println("ROI:" +  roi);
		
		System.out.println("I : " +  i);
	}

}
