// 44. Write a java program to Rotate an array ‘k’ times
// backward.(right-rotate)
// arr[] = {1,2,3,4,5};
// k=2;
// output: 4,5,1,2,3
class RotateArrayBack
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5};
		int k=2;
		for(int i=k+1;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		for(int j=0;j<=k;j++)
		{
			System.out.print(a[j]);
			if(j!=k)
			{
				System.out.print(",");
			}

				

		}
	}
}