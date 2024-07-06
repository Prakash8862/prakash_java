//11. Write a java program to Print elements from3D array using do while loop.
class Print3DArrayDoWhile
{
	public static void main(String[] args) 
	{
		int[][][] a={{{1,2,3},{4,5,6},{7,8,9}}};
		int i=0;
		do
		{
			int j=0;
			do
			{
				int k=0;
				do
				{
					System.out.print(a[i][j][k]+" ");
					k++;
				}while(k<a[i][j].length);
				System.out.println();

				j++;
			}
			while(j<a[i].length);
			i++;
		}while(i<a.length);

	}
}