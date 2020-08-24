import java.util.concurrent.*;
public class Demo1{
	 boolean value;
	
	synchronized void disp1(){
		for(int i = 1; i<=50;){
		while(value)		
		{
			try
			{wait();}
			catch(InterruptedException ie){}
		}
		notifyAll();
		System.out.println(i++);
		
		value = true;	
		}
	}
	synchronized void disp2(){
		for(int i = 50; i>0;){
		while(value)		
		{
			try
			{wait();}
			catch(InterruptedException ie){}
		}
		
		System.out.println(i--);
		notifyAll();
		value = false;	
		}
	}

	public static void main(String[] args){
		ExecutorService exc=Executors.newCachedThreadPool();
		exc.execute(new Thr1(new Demo1()));
		exc.execute(new Thr2(new Demo1()));
		exc.shutdown();
		System.out.println("DONE");
	}

}

class Thr1 implements Runnable{
	Demo1 obj;
	Thr1(Demo1 obj){this.obj = obj;}	
public void run(){
		obj.disp1();
	}
}

class Thr2 implements Runnable{
Demo1 obj;
	Thr2(Demo1 obj){this.obj = obj;}	
public void run(){
	obj.disp2();
}
}

