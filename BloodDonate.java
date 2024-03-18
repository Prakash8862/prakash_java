import java.util.Scanner;
class BloodDonate
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		if(age>20)
		{
			System.out.println("Are Consuming cigarate or alcohol (YES/NO)");
			String alco = sc.next().toLowerCase();
			System.out.println("Enter Your Weight: ");
			double weight = sc.nextDouble();
			if(alco.equals("yes"))
			{
				System.out.println("You not able to Donate");
			}
			else if(weight > 50)
			{
				System.out.println("You able to Donate");
			}
			
		}
		else
		{
			System.out.println("You Not able Donate BLood");
		}
	}
}	