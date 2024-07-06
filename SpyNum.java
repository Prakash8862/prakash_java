import java.util.*;
class SpyNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  Number :");
		int num=sc.nextInt();
		int dup=num;
		int sum=0;
		int prod=1;
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			prod*=rem;
			num/=10;
		}
		if(sum==prod)
		{
			System.out.println(dup + " is  SpyNum");

		}
		else{
			System.out.println(dup+" Is not a SpyNum");
		}
	}
}