import java.util.*;
class PerfectSqrt
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		boolean flag=false;
		int sqrrt=0;
		for (int i=1;i<=num/2;i++) {
			if(i*i==num)
			{
			 flag = true;
			 sqrrt = i;
			 break;
			}
		}
		if(flag)
		{
			System.out.println(sqrrt + " is a PerfectSqrt of num"+num);
		}
		else
		{
			System.out.println(num + " Don't Have a PerfectSqrt");
		}
	}
}