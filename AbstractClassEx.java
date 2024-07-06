abstract class RBI
{
	RBI()
	{
		super();
	}
	abstract void rateOfInterest();
	abstract void withDrawLimit();
	abstract void depositeLimit();


}
abstract class SBI extends RBI
{
	String accountType;
	String userName;
	SBI(String accountType,String userName)
	{
		super();
		this.accountType=accountType;
		this.userName=userName;
	}
	public void displayDetails()
	{
		System.out.println("Accont Type"+this.accountType);
		System.out.println("User Name"+this.userName);
	}
}
class Saving extends SBI 
{
	Saving(String accountType,String userName)
	{
		super(accountType,userName);
	}
	public void rateOfInterest()
	{
		System.out.println("Interst is : "+7+"%");
	}
	public void withDrawLimit()
	{
		System.out.println(50000+"rs.");
	}
	public void depositeLimit()
	{
		System.out.println(500000+"rs.");
	}
}
class Current extends SBI 
{
	Current(String accountType,String userName)
	{
		super(accountType,userName);
	}
	public void rateOfInterest()
	{
		System.out.println("Interst is : "+6+"%");
	}
	public void withDrawLimit()
	{
		System.out.println(5000000+"rs.");
	}
	public void depositeLimit()
	{
		System.out.println(5000000+"rs.");
	}
}
class AbstractClassEx
{
	public static void main(String[] args) 
	{
		Saving obj=new Saving("Saving","Ramesh");
		obj.displayDetails();
		obj.rateOfInterest();
		obj.depositeLimit();
		obj.withDrawLimit();
		System.out.println();
		Current obj1=new Current("Current","Suresh");
		obj1.displayDetails();
		obj1.rateOfInterest();
		obj1.depositeLimit();
		obj1.withDrawLimit();	
	}
}