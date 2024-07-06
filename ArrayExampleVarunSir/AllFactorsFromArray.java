class AllFactorsFromArray
{
	public static void main(String[] args) 
	{
		int [] a={1,2,3,4,5,6,7,8,9,10};
		//int fact=1;

		for(int i=0;i<a.length;i++)
		{

			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
				{
					System.out.print(j);
				}

			}
			System.out.println();s
		}
		// System.out.println("Factorial  "+fact);
	}
}