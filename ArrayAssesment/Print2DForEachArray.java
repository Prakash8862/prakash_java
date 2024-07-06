//8 .Write a java program to Print elements from 2D array using foreach loop.
class Print2DForEachArray
{
	public static void main(String[] args) 
	{
		int[][] a={{1,2,3},{4,5,6}};
		for(int[] i:a)
		{
			for(int j:a)
		{
				System.out.print(j+" ");
		}
		}

	}
}