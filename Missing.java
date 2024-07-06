class Missing
{
	public static void main(String[] args) 
	{
		int num=2457;
		String str=""+num;
			for(char i=str.charAt(0);i<=str.charAt(str.length()-1);i++)
			{
					if(str.contains(""+i))
					{
							System.out.print(i);
					}

			}

	}
}