class Ex1
{
	public static void main(String[] args) {
		try{
				System.out.println("hi i am fromkk");
				String str=null;
				System.out.println(str.isEmpty());
			}
			
		
			catch(ArithmeticException ae){
			System.out.println("Hi from catch");
			}

			catch(RuntimeException re)
			
			{
				System.out.println("RE");
			}
				catch(NullPointerException a)
			{
				System.out.println("Inner Exce Handled");
			}

	
}
}