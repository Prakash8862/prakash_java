import java.util.*;
class EX103
{
	public static void main(String[] args)
	{
		int[] a={25,10,20};
		// int add1=0;
		// int add2=0;
		// int add;
		if(a.length==3)
		{
			int add3=0;
			for(int i=0;i<a.length;i++)
			{
				int add=a[0];
				int add1=a[a.length-2]+a[a.length-1];
				int add2=add+add1;
				add3=add1+add2;
			}
			System.out.print(add3);
		}
		else if(a.length==2)
		{
			for(int i=0;i<a.length;i++)
			{
				add=a[0];
				add1=a[0]+a[a.length-1];
				
			}
			System.out.print(add1);

		}
	}
}