// 13.Find number of elements without using length variable.
// Ip : a={1, 2, 3, 4, 5, 6}
// Op : 6
class FindLength
{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6};
		int lngth=0;
		for(int i=0;i<a.length;i++)
		{
			lngth++;
		}
		System.out.println(lngth);
	}
}
