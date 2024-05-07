package Regular;

public class sample10
{
	public static void main(String[]args)
	{
		System.out.println("main starts");
		try
		{
		int i=1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled");
		}
		finally
		{
			System.out.println("hey i am finally block" );
		}		
		System.out.println("main ends");
		}
	
	}





