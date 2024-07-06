import java.util.*;
class FindLengthOfArray1
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50,60};
		int lngth=0;
		for (; ; )
		{
			try{
				System.out.println(a[lngth++]);
				
			}
			catch(Exception e)
			{
				break;
			}
		}
		System.out.println(lngth-1);
	}
}