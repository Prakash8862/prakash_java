class Automorphic
{
	public static void main(String[] args) {
		int num=6;
		int dup=num;
		int sqrt=num*num;
		int div=1;
		while(num>0)
		{
			div*=10;
			num/=10;
		}
		int ld=sqrt%div;
		if(dup==ld)
			System.out.println("Automorphic");
		else
			System.out.println("Not Automorphic");
	}
}