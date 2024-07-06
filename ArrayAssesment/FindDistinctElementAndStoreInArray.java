// 37.Find all distinct elements in an array and store them in a new
// array.
// Ip : a={4,3,2,3,4,5,6,7}
// Op : b={4,3,2,5,6,7}
class FindDistinctElementAndStoreInArray
{
	public static void main(String[] args) {
		int[] a={4,3,2,3,4,5,6,7};
		//int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					System.out.print(a[j]);
				}
			}
		}
	}
}