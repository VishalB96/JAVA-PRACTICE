import java.io.*;


public class Demo4
{
	public static void main(String args[])
	{
		try(FileOutputStream fos=new FileOutputStream("ab1.txt"))
		{
			try(DataOutputStream dos=new DataOutputStream(fos))
			{
				dos.writeInt(10);
				dos.writeChar('A');
				dos.writeFloat(3.9f);
				dos.writeBoolean(true);
				dos.writeUTF("hello world");
			}
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}

		try(FileInputStream fis=new FileInputStream("ab1.txt"))
		{
		try(DataInputStream dis=new DataInputStream(fis))
		{
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readUTF());
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}




























			