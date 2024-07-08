import java.util.*;
class SelectionSortEx
{
	public static void main(String[] args) 
	{
		int a[]={5,3,6,7,4,2,1};
		System.out.println(Arrays.toString(a));
		selectionSort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void selectionSort(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[min]<a[j])//For Descending Order
				//if(a[i]>a[j]) For Ascending Order
				{
					min=j;
					
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}

	}
}