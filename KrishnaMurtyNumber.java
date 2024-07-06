class KrishnaMurtyNumber
{
	public static void main(String[] args) {
		//for(int j=1;j<=500000;j++)
		//{
			int num=145;
			int dup=num;
			int sum=0;
			while(num!=0)
			{
				int rem=num%10;
				int fact=1;
				for(int i=1;i<=rem;i++)
				{
					fact+=i;

				}
				sum=sum+fact;
				num/=10;
			}
			if(sum==dup)
				System.out.print(dup+"KrishnaMurtyNumber");
		//}
	}
}