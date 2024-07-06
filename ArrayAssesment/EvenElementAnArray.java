// 17.Find all even elements present in an array.
// Ip : a={2, 8, 5, 4, 7, 9}
// Op : 2 8 4
class EvenElementAnArray
{
	public static void main(String[] args) {
		int[] a={2,8,5,4,7,9};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}