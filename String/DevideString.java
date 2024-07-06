//wajp to devide a string into two parts and store them into separate string method
import java.util.*;
class DevideString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String s=new String(sc.next().toLowerCase());
		int devided=s.length()/2;
		String part1=new String();
		String part2=new String();
		if(devided%2==0)
		{
			for(int i=0;i<devided;i++)
			{
				char ch=s.charAt(i);
				part1=part1+ch;
			}
			for(int i=devided;i<s.length();i++)
			{
				char ch=s.charAt(i);
				part2=part2+ch;

			}
		}
		else
		{
			System.out.println("Not be Devided");
		}
		System.out.println(part1);
		System.out.println(part2);

	}
}