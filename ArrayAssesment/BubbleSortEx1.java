import java.util.*;
class BubbleSortEx1
{
	public static void main(String[] args) 
	{
		int a[]={5,3,6,7,4,2,1};
		System.out.println(Arrays.toString(a));
		bubbleSort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void bubbleSort(int [] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]<a[j])//For Descending Order
				//if(a[i]>a[j]) For Ascending Order
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}