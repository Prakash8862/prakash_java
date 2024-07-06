//7. Write a java program to Print elements from2D array using do while loop.
class Print2DArrayDoWhile
{
	public static void main(String[] args) 
	{
		int[][] a={{1,2,3},{4,5,6}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				System.out.print(a[i][j]+" ");
				j++;
			}
			while(j<a[i].length);
			i++;
		}while(i<a.length);

	}
}