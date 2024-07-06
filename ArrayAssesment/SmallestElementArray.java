// 47. Write a java program to find smallest element from an array
// without using sorting method.
// Array :[7, 84, 21,5,35]
// Output: 5
class SmallestElementArray
{
	public static void main(String[] args) {
		int[] a={7,84,21,5,35};
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.print(small);
	}
}
