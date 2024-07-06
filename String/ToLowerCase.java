import java.util.*;
class ToLowerCase
{
	static String str;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		str = sc.nextLine();
		String op=userToLowerCase();
		System.out.println(str+" : "+op);
		
	}
	public static String userToLowerCase()
		{
			String nstr="";
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch>='A' && ch<='Z')
				{
					nstr=nstr+(char)(ch+32);
				}
				else
				{
					nstr=nstr+ch;
				}

			}
			return nstr;
		}
}