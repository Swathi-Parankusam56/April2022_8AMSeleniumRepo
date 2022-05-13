package hdfc.loans.homeloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.indexOf('v'));
		System.out.println(s1.charAt(2));
		
		
		String s2 = new String("lella");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		String s3 = "Ravikanth";
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		String s4 = "ravi";
		System.out.println(s1.contains(s4));
		
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s3);
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		System.out.println(s4);
		System.out.println(s4.startsWith("ra"));
		System.out.println(s4.endsWith("vi"));
		
		System.out.println(s4);
		System.out.println(s4.replace('r', 'k'));
		
		String s5 = " Ravi";
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));
		System.out.println(s4.equalsIgnoreCase(s5.trim()));
		System.out.println(s4.equals(s5.trim().toLowerCase()));
		
		String s6 = "ravi kanth lella";
		String[] str = s6.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
	}

}
