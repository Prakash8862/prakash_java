//wajp to devide a string into two parts and store them into separate string method
import java.util.*;
class DevideString2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		String s=new String(sc.next().toLowerCase());
		int devided=s.length()/2;
		String part1=new String();
		String part2=new String();
		String rev1=new String();
		String rev2=new String();
		if(devided%2==0)
		{
			for(int i=0;i<devided;i++)
			{
				char ch=s.charAt(i);
				part1=part1+ch;
			}
			for(int i=devided-1;i>=0;i--)
			{
				char ch=s.charAt(i);
				rev1=rev1+ch;
			}
			for(int i=devided;i<s.length();i++)
			{
				char ch=s.charAt(i);
				part2=part2+ch;

			}
			for(int i=s.length()-1;i>=devided;i--)
			{
				char ch=s.charAt(i);
				rev2=rev2+ch;
			}
		}
		else
		{
			System.out.println("Not be Devided");
		}
		System.out.println("First Half  "+part1);
		System.out.println("Rev First Half  "+rev1);
		System.out.println("Second Half  "+part2);
		System.out.println("Rev Second Half   "+rev2);


	}
}