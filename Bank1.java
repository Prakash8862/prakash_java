import java.util.*;
class Bank1
{
	static String name;
	static String address;
	static long adhar;
	static double bal;
	static long phone;
	static int upiPin; 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		for (; ; )
		{
		 System.out.println(**** Welcome to JAVA BANK ****);
		 System.out.println();	
		 System.out.println("1. Create a acoount");
		 System.out.println("2. Existing Account");
		 System.out.println("Enter an Option");
		 int option=sc.nextInt();
		 System.out.println();
		 switch(option)
		 {
		 case 1:{
		 	System.out.println("$$$$ Creating Account Module $$$$");
		 	sc.nextLine();
		 	System.out.println("Eneter Your Name : ");
		 	name=sc.nextLine();
		 	System.out.println("Enter Your Address : ");
		 	address=sc.nextLine();
		 	System.out.println("Enter Your AdharNumber : ");
		 	adhar=sc.nextLong();
		 	System.out.println("Enter Your phone number : ");
		 	phone=sc.nextInt();
		 	System.out.println("Enetr Your balance : ");
		 	bal=sc.nextInt();
		 	System.out.println("Enet Your UPI PIN : ");
		 	upiPin=sc.nextInt();
		 	System.out.println("Account Craeted Successfully...");
		 	System.out.println();
		 	break;
		 }
		case 2:{
			for (; ; ) {
				System.out.println();
				System.out.println("%%%% Features %%%%");
				System.out.print("1.Check Balance 2.Deposite 3.Withdraw 4.info 5.logout");
				System.out.println("Eneter a Option");
				int opt=sc.nextInt();
				switch(opt)
				{
				case 1:{
					System.out.println("Eneter a pin : ");
					int pin=sc.nextInt();
					if(pin==upiPin)
					{
						System.out.println("You Account Balance is : "+bal);
					}
					else{
						System.out.println("Wrong Pin");
					}
					break;
				}
				case 2:{
					System.out.println("Eneter a deposite amount : ");
					int depositeAmount=sc.nextInt();
					bal=bal+depositeAmount;
					break;
				}
			   case 3:{
			   		System.out.println("Enter a withdraw amount : ");
			   		int withdrawAmount
			   }
			}
				
			}
		 }
		}
		}


	}
}
