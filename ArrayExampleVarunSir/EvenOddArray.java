import java.util.*;
class EvenOddArray
{
	public static void main(String[] args) 
	{
		int a[]={23,45,67,2,4};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" is Even");
			}
			else
			{
				System.out.println(a[i]+" is ODD");
			}
		}
	}
}