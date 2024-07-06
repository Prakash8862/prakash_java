//43. Write a java program to Rotate an array ‘k’ timesforward.(left rotate)/
//arr[] = {1,2,3,4,5}; k=2
//output: 3,4,5,1,2
class RotateArray
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5};
		int k=2;
		for(int i=k;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		for(int j=0;j<k;j++)
		{
			System.out.print(a[j]);
			if(j!=k-1)
			{
				System.out.print(",");
			}

				

		}
	}
}