import java.io.*;
import java.util.*;
public class Demo3{


	public static void main(String args[]){
	
	File f = new File(args[0]);
	if(!f.exists())	{
		System.out.println("File does not exists!\nCreating new file with name "+ args[0]);
		try(FileWriter fw = new FileWriter(f))
		{
			System.out.println("Enter Your name : ");
			String s1 = new String();
			Scanner sc = new Scanner(System.in);
			s1 = sc.nextLine();
			fw.write(s1);
		}
		catch(IOException ie){
			ie.printStackTrace();	
		}
		
		try(FileReader fr = new FileReader(f))
		{
			String s2 = new String();
			int i;	
			while((i=fr.read())!=-1)    
         	 	System.out.print((char)i);  
		}	
		catch(IOException ie)
		{ie.printStackTrace();}
	}
	}	
}