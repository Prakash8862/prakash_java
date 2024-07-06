// 46. Write a java program to find largest element from an array
// without using sorting method.
// Array :[7, 84, 21,45,35]
// Output: 84
// Array :[2,2,2]
// Output: 2
class HighestElement
{
	public static void main(String[] args) 
	{
		int[] a={7,84,21,45,35};
		int l=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>l)
			{
				l=a[i];
			}
		}
		System.out.print(l);

	}
}