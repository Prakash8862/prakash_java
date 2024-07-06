import java.util.*;
class FetchNegativeNumberArray
{
	public static void main(String[] args) 
	{
		int a[]={10,-9,7,-9,4,-12};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]);
			}
		}
	}
}