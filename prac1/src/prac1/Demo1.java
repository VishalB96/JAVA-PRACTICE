package prac1;

abstract class wepons{
	abstract void attack();
}

class guns extends wepons{

	
	void attack() {
		System.out.println("attcak using gun");
		
	}
	
}

class sword extends wepons{

	
	void attack() {
		System.out.println("attack using sword");
		
	}
	
	
}

interface emp {
	void disp(String name);
}
class Sample
{
	void disp1(String ss)
	{
		System.out.println(ss);
	}
}
public class Demo1 {
	
	public void perform(wepons ob) 
	
	{
		ob.attack();
	}

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.perform(new guns());
		d.perform(new sword());
		emp ref1=new emp()
		{
			public void disp(String name) {
				
				System.out.println("annonymous class name: " + name);
			}
		};
		ref1.disp("anonymous1");
		
		emp ref2=(String name)->{ System.out.println("using lamda name : " + name);};
		ref2.disp("lambda");
		
		Sample s1 = new Sample();
		emp ref3 = s1::disp1;
		ref3.disp("name1");
}

}
