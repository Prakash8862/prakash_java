class ForPatternEx8
{
	public static void main(String[] args)
	{
		int num=1;

		for (int i=0;i<=5;i++) 
		{	
			int currentnum=num;
			for (int j=0;j<=i;j++)
			 {
				System.out.print(currentnum +" ");
				currentnum--;
				
				
			}
			num += (i+2);
			System.out.println();	
		}	
	}
}