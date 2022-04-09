package practice;

public class StringPractice 
{

	public static void main(String[] args) 
	{
		String timmy = "M.M522";
		String b ="m.m522";
		
		//Integer. 
		
		StringBuilder ss= new StringBuilder(timmy); 
		System.out.println(ss.reverse().toString());
		System.out.println(ss.reverse());
		System.out.println(ss.reverse());
//		timmy = timmy.toLowerCase();
//		b = b.toUpperCase();
//		System.out.println(timmy + b);

	}

}
