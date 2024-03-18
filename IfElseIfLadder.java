import java.util.Scanner;
class IfElseIfLadder
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Percentage");
		double per = sc.nextDouble();
		if(per >= 90 && per <= 100)
		{
			System.out.println("You pass with firstclass destinction and grade is O");
		}
		else if(per >= 75 && per < 90)
		{
			System.out.println("You pass with  destinction and grade is A+");
		}
		else if(per >= 60 && per < 75)
		{
			System.out.println("You pass with firstclass and grade is A");
		}
		else if(per >= 35 && per < 60)
		{
			System.out.println("You pass with Secondclass  and grade is B");
		}
		else 
		{
			System.out.println("You are failed");
		}
	}
}