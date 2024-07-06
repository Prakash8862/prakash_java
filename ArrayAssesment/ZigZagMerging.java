// 35.Perform Zig Zag merging of arrays.
// Ip : a={1,2,3}
// b={4,5,6,7,8}
// Op : c={1,4,2,5,3,6,7,8}
import java.util.*;
class ZigZagMerging
{
	public static void main(String[] args) {
		int[] a={1,2,3};
		int[] b={4,5,6,7,8};
		int[] c=new int[a.length+b.length];
		int indx=0;
		for(int i=0;i<a.length;i++)
		{
				c[indx++]=a[i];
				for(int j=0;j<b.length;j++)
				{
					c[indx++]=b[j];
					

					
				}
		}
		System.out.print(Arrays.toString(c));
	}
}