// 14.Find sum of all elements present in an array.
// Ip : a={2, 2, 4, 4, 6, 6}
// Op : 24
class SumOfElements
{
	public static void main(String[] args) {
		int[] a={2,2,4,4,6,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}