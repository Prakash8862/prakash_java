// 22.Find even elements and store it in a new array.
// Ip : a={1, 2, 3, 4, 5, 6}
// Op :b={2,4,6}
import java.util.*;
class FindEvenElementAndStoreInNewArray
{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
				if(a[i]%2==0)
				count++;
		}
		int[] b=new int[count];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				b[j++]=a[i];
			}
		}
		// for(int i:a)
		// {
		// 	if(i%2!=0)
		// 	{
		// 		count++;
		// 	}		
		// }
		// int[] b=new int[count];
		// int c=0;
		// for(int i:a)
		// {
		// 		if(i%2!=0)
		// 		{
		// 			b[c++]=i;
		// 		}
		// }
		System.out.println(Arrays.toString(b));
	}
}