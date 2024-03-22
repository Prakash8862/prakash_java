import java.util.*;
class LengthOfNum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();

		//int num=123;
		int length=0;
		for(int i=num;i>0;i/=10)
		{
			length++;
		}
		System.out.println("Length of entered number : "+length);
	}
}