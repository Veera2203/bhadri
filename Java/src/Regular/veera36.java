package Regular;

public class veera36
{
	public static void main(String[]args)
	{
		int[]arr= {10,20,30	};
		int[]abb= {40,50,60};
		int size=arr.length+abb.length;
				int[]acc=new int[size];
		int pos=0;
		for(int i:arr)
		{
			acc[pos]=i;
			pos++;
		}
for(int j:abb)
{
	acc[pos]=j;
	pos++;
}
for(int k:acc)
{
	System.out.println(k);
}
}
}
