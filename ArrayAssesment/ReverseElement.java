// 15.Reverse elementsin an array.
// Ip : a={1, 2, 3, 4, 5, 6}
// Op : 6 5 4 3 2 1
class ReverseElement
{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}