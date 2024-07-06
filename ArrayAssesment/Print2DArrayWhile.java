//6. Write a java program to Print elements from2D array using while loop.
class Print2DArrayWhile
{
	public static void main(String[] args) 
	{
		int[][] a={{1,2,3},{4,5,6}};
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			i++;
		}

	}
}