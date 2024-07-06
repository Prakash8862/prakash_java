// 42. Write a java program to store user elements in an array and tak
// length from user
import java.util.*;
class TakeInputAndStrore
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of array : ");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter a "+i+" th index Element : ");
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements : "+Arrays.toString(a));
	}
}
