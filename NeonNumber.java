class NeonNumber
{
	public static void main(String[] args) {
		for (int j=0;j<=500;j++ ) {
			
		int num=j;
		int sqr=num*num;
		int sum=0;
		while(sqr!=0)
		{
			int rem=sqr%10;
			sum+=rem;
			sqr/=10;
		}
		if (sum==num) {
			System.out.println(num +" is NeonNumber");			
		}
		else
			System.out.println(num+" is Not NeonNumber");
	}
	}
}