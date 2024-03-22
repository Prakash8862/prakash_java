import java.util.Scanner;
class WhileArmStrong1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num=sc.nextInt();
		int length=0;
		int dup=num;
		int dup1=num;
		int sum=0;
		while(num!=0)
		{
			length++;
			num/=10;
		}
		while(dup!=0)
		{
			int rem=dup%10;
			int power=1;

			for(int i=1;i<=length;i++)
			{
				power*=rem;
			}
			sum+=power;
			dup/=10;
		}
		if(sum==dup1)
		{
			System.out.println("Entered number is ArmStrong");
		}
		else
		{
			System.out.println("Entered number is Not ArmStrong");
		}
	}
}