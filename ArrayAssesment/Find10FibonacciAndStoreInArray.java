// 25.Find first 10 Fibonacci numbers and store it in an array.
// Op :a={0,1,1,2,3,5,8,13,21,34}
import java.util.*;
class Find10FibonacciAndStoreInArray
{
	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		int n3;
		int[] a=new int[10];
		a[0]=0;
		a[1]=1;
		int indx=2;
		for(int i=2;i<=10;++i)
		{
			n3=n1+n2;
			a[indx++]=n3;
			n1=n2;
			n2=n3;
			if(indx==10)
				break;
		}
		System.out.print(Arrays.toString(a));
	}
}