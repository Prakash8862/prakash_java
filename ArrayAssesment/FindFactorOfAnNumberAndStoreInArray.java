// 31.Find factors of a number and store them in an array.
// Ip : num : 12
// Op : a={1,2,3,4,6,12}
import java.util.*;
class FindFactorOfAnNumberAndStoreInArray
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		int[] a=new int[count];
		int indx=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				a[indx++]=i;
			}
		}
		System.out.print(Arrays.toString(a));

	}
}