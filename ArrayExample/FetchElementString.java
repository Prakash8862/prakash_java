import java.util.*;
class FetchElementString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String sen=sc.nextLine();
		String word="";
		for (; ; ) 
		{
			int i=0;
			for(;i<sen.length();i++)
			{
				char ch=sen.charAt(i);
				if(ch==' ')
				{
					i=i+1;
					break;
				}
				word+=ch;
		        System.out.println(word);

			}
		}

	}
}