package test1;

class base
{
	static void disp(int k)
	{
		System.out.println("base disp");
	}
	static
	{
		System.out.println("base static block");
	}
}
class sub extends base
{
	static void disp()  
	{
		System.out.println("sub disp");
	}
	static
	{
		System.out.println("sub static block");
	}
}
public class Demo4
{
	public static void main(String args[])
	{
		sub.disp(4);
		Integer n1 = new Integer(125);
		System.out.println(n1);
		n1+=12;
		System.out.println(n1);
		String s1 = new String("125");
		System.out.println(s1);
		s1+=29;
		System.out.println(s1);
		int temp = Integer.parseInt(s1);
		System.out.println(temp+12);
	}
}