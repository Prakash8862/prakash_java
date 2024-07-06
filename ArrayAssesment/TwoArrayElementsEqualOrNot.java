// 45. Write a java program to check if 2 arrays are equal or not.
// Array 1: [1, 2, 3, 4, 5], Array 2: [1, 2, 3, 4, 5]
// Output: true
// Array 1: [7, 14, 21,45,35], Array 2: [7, 14, 21, 36]
// Output: false
class TwoArrayElementsEqualOrNot
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40};
		int[] b={10,20,30,50};
		boolean flag=false;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				
					if(a[i]==b[i])
					{
						flag=true;
					}
					else
					{
						flag=false;
						break;
					}
				

			}
		}
		System.out.print(flag);

	}

}