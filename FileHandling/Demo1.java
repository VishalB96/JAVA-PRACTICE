import java.io.*;
public class Demo1{


	public static void main(String args[]){

	File f = new File("New1.txt");
	if(!f.exists())	
		System.out.println("File does not exists!");
	

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