// 26.Find sum of all elements at even indices in an array.
// Ip : a={6,5,4,3,7,8,0}
// Op : 17
class EvenIndexSum
{
	public static void main(String[] args) {
		int[] a={6,5,4,3,7,8,0};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.print(sum+" ");
	}
}