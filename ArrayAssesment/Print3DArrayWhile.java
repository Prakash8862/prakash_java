//10. Write a java program to Print elements from3D array using while loop.
class Print3DArrayWhile
{
	public static void main(String[] args) 
	{
		int[][][] a={{{1,2,3},{4,5,6},{7,8,9,10}}};
		int i=0;
		while(i<a.length)
		{
			int j=0;
			while(j<a[i].length)
			{
				int k=0;
				while(k<a[i][j].length)
				{
					System.out.print(a[i][j][k]+" ");
					k++;
				}
				j++;
				System.out.println();
			}
			i++;
		}

	}
}