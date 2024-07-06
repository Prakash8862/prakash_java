// 36.Find duplicate elementsin an array.
// Ip : a={6,5,4,6,5,8,6}
// Op : 6 , 5
class FindDuplicateNumberArray
{
	public static void main(String[] args) {
		int[] a={6,5,4,6,5,8,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					System.out.print(a[j]);
				}
			}
		}
	}

}