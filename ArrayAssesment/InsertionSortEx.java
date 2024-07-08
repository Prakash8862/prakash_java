import java.util.*;
class InsertionSortEx
{
	public static void main(String[] args) {
		int a[]={5,3,6,7,4,2,1};
		insertionSort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void insertionSort(int [] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]<temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
}