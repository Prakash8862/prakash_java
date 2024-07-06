// import java.util.*;
// class FindSmallestElement
// {
// 	public static void main(String[] args) 
// 	{
// 		int[] a={2,3,5,7,9};
// 		int min=a[0];
// 		for(int i=0;i<a.length;i++)
// 		{
// 			if(a[i]<min)
// 			{
// 				min=a[i];
// 			}
// 		}
// 		System.out.println(min);
// 	}
// }


//find largest Element
import java.util.*;
class FindSmallestElement
{
	public static void main(String[] args) 
	{
		int[] a={2,3,5,7,9};
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}