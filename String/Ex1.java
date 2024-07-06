import java.util.*;
class Ex1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterb  a Stringb : ");
		String b=sc.next();
		String a="";
		for(int i=0;i<b.length();i++)
		{
			if(i%2==0)
			{
				a=a+b.toUpperCase().charAt(i);
			}
			else
			{
				a=a+b.toLowerCase().+charAt(i);
			}
		}
		System.out.println(a);
	}
}