import java.util.*;
class PallindromeName
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enterb a Name : ");
		String name=sc.next();
		String revname="";
		for (int i=name.length()-1;i>=0;i--)
		{
				revname += name.charAt(i);	
		}
		if(revname.equals(name))
			System.out.print(" PallindromeName");
		else
			System.out.print(" Not PallindromeName");
	}
}