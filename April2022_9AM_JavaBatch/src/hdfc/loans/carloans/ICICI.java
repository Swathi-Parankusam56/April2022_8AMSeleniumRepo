package hdfc.loans.carloans;

public class ICICI implements Rbi
{

	@Override
	public void withdrawl() {
		System.out.println("iam overiden withdrawl in ICICI");
	}

	@Override
	public void deposit() {
		System.out.println("iam overiden deposit in ICICI");
	}
	
	public static void main(String[] args) 
	{
		 ICICI i = new ICICI();
		 i.deposit();
		 i.withdrawl();
	}

}
