package Regular;

class Main_class
{
	private int a=10;
	public int get()
	{
		return a;
	}
	public void set(int a)
	{
		this.a=a;
	}
	}
class Sample
{
	public static void main(String[]args)
{
		Main_class s1=new Main_class();
int x=s1.get();
System.out.println(x);
s1.set(20);
System.out.println(s1.get());
}
}
