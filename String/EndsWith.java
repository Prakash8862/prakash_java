import java.util.*;
class EndsWith
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		str=sc.nextLine();
		System.out.print("Eneter a String to Check : ");
		String str1=sc.next();
		System.out.print("Enter a Index : ");
		int searchIndx=sc.nextInt();
		 boolean op=userEndsWith(str1,searchIndx);
		System.out.println(str+" : "+op );

	}
	public static boolean userEndsWith(String str1)
	{
		boolean flag=false;
		for(int i=str1.length()-1;i>=0;i--)
		{
			char ch=str1.charAt(i);
			if(ch!=str.charAt(i))
			{
				flag=true;
				break;
			}
		}
			return flag;

	}
	// public static boolean userStartsWith(String str1,int startIndx)
	// {
	// 	if(startIndx<0 || startIndx>str.length()-1)
	// 	{
	// 		throw new StringIndexOutOfBoundsException("WRONG INPUT");
	// 	}
	// 	boolean flag=true;
	// 	for(int i=startIndx;i<str.length();i++)
	// 	{
	// 		char ch=str1.charAt(i);
	// 		if(ch!=str.charAt(i))
	// 		{
	// 			flag=false;
	// 			break;
	// 		}
	// 	}
	// 	return flag;

	}
}