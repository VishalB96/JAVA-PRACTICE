//package test1;

public class Demo2
{
	public static void main(String args[])
	{
        int arr[]=new int[4];
        arr[1]=19;
		System.out.println("Array created "+arr[1]);
		try
		{
			arr=null;
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("In catch\t"+ae);
		}
		finally
		{
            
			System.out.println("I am always printed");
		}
		System.out.println("asas");
	}
}












