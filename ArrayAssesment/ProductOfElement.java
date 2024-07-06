// 16.Find product of all elements present in an array.
// Ip : a={2, 2, 4, 4, 6, 6}
// Op : 2304
class ProductOfElement
{
	public static void main(String[] args) 
	{
		int[] a={2,2,4,4,6,6};
		int prod=1;
		for(int i=0;i<a.length;i++)
		{
			prod=prod*a[i];
		}
		System.out.println(prod);


	}
}