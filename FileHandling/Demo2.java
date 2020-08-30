import java.io.*;
public class Demo2{


	public static void main(String args[]){
	
	File f = new File(args[0]);
	if(!f.exists())	{
		System.out.println("File does not exists!\nCreating new file with name "+ args[0]);
	
		try(FileOutputStream fos = new FileOutputStream(f,true))
		{
			byte b[] = new byte[100];
			System.out.println("Enter the Name");
			int k = System.in.read(b);
			fos.write(b,0,k);		
		}
		catch(IOException oe){
			oe.printStackTrace();
		}
	}

	try(FileInputStream fis = new FileInputStream(f))
	{
		byte b[]= new byte[((int)f.length())];
		fis.read(b);
		String ss = new String(b);
		System.out.println(ss);
	}
	catch(IOException ee){
		ee.printStackTrace();	
	}
	}	
}