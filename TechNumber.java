import java.util.*;
class TechNumber
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int dup=num;
		int length=0;
		while(num!=0)
		{
			length++;
			num/=10;
		}
		if(length%2==0)
		{
			int div=1;
			for(int i=1;i<=length/2;i++)
			{
				div=div*10;
			}
			int firsthalf=dup/div;
			int lasthalf=dup%div;
			int sum=firsthalf+lasthalf;
			int sqr=sum*sum;
			if(dup==sqr)
			{
				System.out.println(dup+" is tech num");
			}
			else
			{
				System.out.println(dup+" is not tech num");
			}
		}
		else
			System.out.println("NOt a Tech NUmber");
	}
}