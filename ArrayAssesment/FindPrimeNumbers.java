// 19.Find all prime elements present in an array.
// Ip : a={2, 8, 5, 4, 7, 9}
// Op : 2 5 7
class FindPrimeNumbers
{
	public static void main(String[] args) {
		int[] a={2,8,5,4,7,9};
		for(int i=0;i<a.length;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}