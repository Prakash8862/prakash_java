import java.util.Scanner;

class Payment
{
	public void findPayment(Payment obj)
	{
	if(obj instanceof GooglePay)
	{
		GooglePay obj1=(GooglePay)obj;
		System.out.println(obj1.str);
	}
	else if(obj instanceof PhonePay)
	{
		PhonePay obj1=(PhonePay)obj;
		System.out.println(obj1.str);
	}
	else
	{
		AmazonPay obj1=(AmazonPay)obj;
		System.out.println(obj1.str);
	}
	}
}
class GooglePay extends Payment
{
	String str="GooglePay";
}
class PhonePay extends Payment
{
	String str="PhonePay";
}

class AmazonPay extends Payment
{
	String str="AmazonPay";
}
class FlipKart
{
	public void payment()
	{
		System.out.println("1.Google Pay");
		System.out.println("2.Phone Pay");
		System.out.println("3.Amazon Pay");
		System.out.println("4.Cash On Delivery");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Option");
		int opt=sc.nextInt();
		Payment obj = null;

		switch(opt)
		{
			case 1:
			{
  				obj =new GooglePay();
  				obj.findPayment(obj);
  				break;
			}
			case 2:
			{
  				obj =new PhonePay();
  				obj.findPayment(obj);
			}
			case 3:
			{
  				obj =new AmazonPay();
  				obj.findPayment(obj);
  				break;
			}
			case 4:
			{
				System.out.println("Keep Your Cash Ready");
  				break;
			}
		}
	}
}
class FlipKartDriver
{
	public static void main(String[] args) 
	{
		FlipKart obj = new FlipKart();
		obj.payment();
	}
}