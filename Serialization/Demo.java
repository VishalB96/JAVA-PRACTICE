import java.io.*;
class base implements Serializable {
	int num1 = 10;
	int num2 = 20;
	{num1++;num2++;}
	
	
}

class sub extends base {
	public String name1 = "VISHAL";
	String name2 = "BHONSLE";
	public int n=20;
	diffSub ds = new diffSub();	
}

class diffBase implements Serializable {
	String s1 = "from diff base";
		
}

class diffSub extends diffBase{
	String s2 = "From diff Sub";

}

public class Demo{

		public static void main(String args[]){
		
			sub so = new sub();
			try(FileOutputStream fo = new FileOutputStream("ob1.txt");
			ObjectOutputStream os = new ObjectOutputStream(fo);
			FileInputStream fi = new FileInputStream("ob1.txt");
			ObjectInputStream ois = new ObjectInputStream(fi)){
				os.writeObject(so);
				sub so2 = (sub)ois.readObject();
				System.out.println(so2.num1);
			}
			catch(Exception ioe){ioe.printStackTrace();}

			
}	
}

