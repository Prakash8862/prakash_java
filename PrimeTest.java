import java.util.Scanner;
class PrimeTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			
			if(prime(rem))
			{
				sum=sum+rem;
			}
			num=num/10;
		}
		System.out.println(sum);
	}
		public static boolean prime(int rem)
		{
			boolean flag=true;
			for(int i=2;i<rem;i++)
			{
				if(rem%i==0)
				{
					flag=false;
				}
			}
			return flag;	

		}
	}
