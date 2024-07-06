// 28.Merge two 1D arrays.
// Ip : a={1,2,3}
// b={4,5,6}
// Op : c={1,2,3,4,5,6}
import java.util.*;
class Merge1DArray
{
	public static void main(String[] args) {
		int[] a={1,2,3};
		int[] b={4,5,6};
		int[] c=new int[a.length+b.length];
		int indx=0;
		//System.out.print(c.length);
		for(int i=0;i<a.length;i++)
		{
			c[indx++]=a[i];
			
		}
		for(int j=0;j<b.length;j++)
			{
				c[indx++]=b[j];
			}
		System.out.print(Arrays.toString(c));
	}
}