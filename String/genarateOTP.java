//write a java program to genarate 25 random otp and store them in string buffer object
class GenarateOTP
{
	public int otpMethod()
	{
		int max=1000;
		int min=1;
		int otp=(int)(Math.random()*(max-min)+1)+max;
		return otp;
	}
	public static void main(String[] args) {
		StringBuffer otps=new StringBuffer();
		GenarateOTP o=new GenarateOTP();
		for(int i=1;i<=25;i++)
		{
			otps.append(o.otpMethod()+"\n");
		}
		System.out.print(otps);
	}
}