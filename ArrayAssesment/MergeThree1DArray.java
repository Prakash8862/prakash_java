// 29.Merge three 1D arrays.
// Ip : a={1,2,3}
// b={4,5,6}
// c={7,8,9}
// Op : c={1,2,3,4,5,6,7,8,9}
import java.util.*;
class MergeThree1DArray
{
	public static void main(String[] args) {
		int[] a={1,2,3};
		int[] b={4,5,6};
		int[] c={7,8,9};
		int[] d=new int[a.length+b.length+c.length];
		int indx=0;
		for(int i=0;i<a.length;i++)
		{
			d[indx++]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			d[indx++]=b[j];
		}
		for(int k=0;k<c.length;k++)
		{
			d[indx++]=c[k];
		}
		System.out.print(Arrays.toString(d));
	}
}