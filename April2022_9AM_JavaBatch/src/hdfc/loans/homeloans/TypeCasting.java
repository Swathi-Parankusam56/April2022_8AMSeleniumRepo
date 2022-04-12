package hdfc.loans.homeloans;

public class TypeCasting 
{

	public static void main(String[] args) 
	{
		//byte-1, short-2, int-4, long-8, float-4, double-8, char-2
		
		//1-Liter  --->  500 ML  ---> There is no risk  --> widening
		//1-Liter  --->  1.5 Ltr ---> There is risk (water overflow)  ---> Narrowing
		
		
		double x = 10.7;
		System.out.println(x);
		
		int y = (int) x;
		System.out.println(y);
		
		int p = 65;
		System.out.println(p);
		
		char q = (char) p;
		System.out.println(q);
		
		System.out.println("----------------------------------s");
		
		int x1 = 10;
		System.out.println(x1);
		
		//Integer x2 = x1;
		Integer x2 = Integer.valueOf(x1);
		System.out.println(x2);
		
		Integer y1 = 20;
		System.out.println(y1);
		
		//int y2 = y1;
		int y2 = (int)y1;
		System.out.println(y2);
		
		System.out.println("----------------------------------s");
		
		String s1 = "200";
		String s2 = "300";
		
		System.out.println(s1+s2);
		
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		System.out.println(f1+f2);
		
		Float fp1 = Float.valueOf(f1);
		Float fp2 = Float.valueOf(f2);
		System.out.println(fp1+fp2);
		
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		System.out.println(p1+p2);

	}

}
