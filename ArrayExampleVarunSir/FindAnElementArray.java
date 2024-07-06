import java.util.*;
class FindAnElementArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Ennter Find Element");
		int findKey=sc.nextInt();
		int a[]={10,20,20,40,34,56,78,65};
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==findKey)
			{
				System.out.println(findKey+" Position in array is "+(i+1);
				flag=false;
				
				//If we want to print duplicate element position then simply dont use break

				break;
			}
		}
		if(flag)
		{
			System.out.println("Not Present");
		}

	}
}