package Regular;

public class sample12 
{
	public static void main(String[]args)
	{
		System.out.println("main starts");

		int []arr= {10,20,30};
		try
		{
			System.out.println(arr[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handled");
		}		
		System.out.println("main ends");
		}
}
