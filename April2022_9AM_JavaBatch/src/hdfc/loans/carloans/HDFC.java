package hdfc.loans.carloans;

public class HDFC implements Rbi
{

	@Override
	public void withdrawl() {
		System.out.println("iam overiden withdrawl in HDFC");
	}

	@Override
	public void deposit() {
		System.out.println("iam overiden deposit in HDFC");
	}
	
	public static void main(String[] args) 
	{
		HDFC h = new HDFC();
		h.deposit();
		h.withdrawl();
	}

}
