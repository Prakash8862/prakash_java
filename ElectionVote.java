import java.util.Scanner;
class ElectionVote
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter YOur age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Do  You have voter id(yes/mo)");
			String voterId = sc.next().toLowerCase();
			if(voterId.equals("yes"))
			{
				System.out.println("***Wel come ***");
				System.out.println("1.BJP");
				System.out.println("2.CONGRESS");
				System.out.println("3.AAP");
				System.out.println("4.SHIVSENA");
				System.out.println("5.MNS");
				System.out.println("6.NCP");
				System.out.println("7.NOTA");
				System.out.println("Enter the option for your party");
				String vote = sc.next().toUpperCase();
				if(vote.equals("BJP"))
				{
					System.out.println("You voted for bjp");
				}
				else if(vote.equals("CONGRESS"))
				{
					System.out.println("You voted for congress");
				}
				else if(vote.equals("AAP"))
				{
					System.out.println("You voted for AAP");
				}
				else if(vote.equals("SHIVSENA"))
				{
					System.out.println("You voted for shivasena");
				}
				else if(vote.equals("MNS"))
				{
					System.out.println("You voted for mns");
				}
				else if(vote.equals("NCP"))
				{
					System.out.println("You voted for ncp");
				}
				else if(vote.equals("NOTA"))
				{
					System.out.println("You voted for NOTA");
				}
				else
				{
					System.out.println("Invalid Input");
				}
			}
			else
			{
				System.out.println("Jaldi hato");
			}
		}
		else
		{
			System.out.println("You not matured try after"+(18-age)+"Years");
		}
	}
}
	