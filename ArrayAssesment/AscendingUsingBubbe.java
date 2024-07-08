// 48. Write a java program to sort an array in ascending order using
// Bubble sort.
// arr[]={4,2,1,3,5};
// Output: 1,2,3,4,5
import java.util.*;
class AscendingUsingBubbe
{
	public static void main(String[] args) 
	{
		int a[]={4,2,1,3,5};
		ascendingBubble(a);
		System.out.println(Arrays.toString(a));

	}
	public static void ascendingBubble(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}