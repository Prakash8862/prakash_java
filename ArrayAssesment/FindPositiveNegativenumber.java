// 20.Find count of positive and negative elements present in an array.
// Ip : a={7, -6, 4, -1, 5}
// Op : Positive : 3
// Negative : 2
class FindPositiveNegativenumber
{
	public static void main(String[] args) {
		int[] a={7, -6, 4, -1, 5};
		int pos=0;
		int neg=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				pos++;
			}
			else if (a[i]<0) 
			{
				neg++;
			}
		}
		System.out.println("Positive : "+pos);
		System.out.println("Negative : "+neg);
	}
}