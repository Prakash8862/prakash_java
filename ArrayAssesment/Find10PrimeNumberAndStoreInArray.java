// 24.Find first 10 prime numbers and store it in an array.

// Op :a={2,3,5,7,11,13,17,19,23,29}
import java.util.*;
class Find10PrimeNumberAndStoreInArray
{
	public static void main(String[] args) 
	{
		int[] b=new int[10];
		int indx=0;
		
		for(int i=2;i<100;i++)
			{
				boolean isPrime=true;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						isPrime=false;
						break;
					}
				}
				if(isPrime)
				{
					// System.out.print(i+" ");
					b[indx++]=i;
				}
				if(indx==10)
				{
					break;
				}
			}
			System.out.print(Arrays.toString(b));
	}
}