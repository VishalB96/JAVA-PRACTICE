import java.lang.reflect.*;
import java.util.*;

public class BankApp{
    static String ClassNames[]={"Savings","Current"};
/*METHOD TO CREATE OBJECT OF ACC */
    public static Object createOb(String[] info){
        Object ob1 = null;
        
        try {
            Class cDef = Class.forName(ClassNames[Integer.parseInt(info[0])-1]);
            Constructor ctor=null;
            ctor=cDef.getDeclaredConstructor(String.class,String.class);
            ob1 = ctor.newInstance(info[1],info[2]);
        } catch (ClassNotFoundException|NoSuchMethodException|InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        return ob1;
    }
/*METHOD TO GET USERS INFO */
    public static String[] getInfo(){
      System.out.println("Select yout choice of account \n1.Saving\n2.Current\n");
      Scanner sc = new Scanner(System.in);
      String[] info = new String[3];
      info[0]=sc.next();
      System.out.println("\nEnter Name");
      info[1] = sc.next();
      System.out.println("\nEnter address");
      info[2] = sc.next();
      return info;
    }

    public static void displayBalance(Object Cust1){
      if( Cust1 instanceof Savings){
         ((Savings)(Cust1)).DisplayBalance();
     }else if(Cust1 instanceof Current){
         ((Current)(Cust1)).DisplayBalance();
     }
    }


    public static void main(String[] args) {
         System.out.println("WELCOME TO BANK\n");
         Object Cust1 = null;
        do{
            System.out.println("\nEnter Your Choice \n1.Create New Account.\n2.Display Balance.\n3.exit.");
            int key=0;
            Scanner sc = new Scanner(System.in);
            key = sc.nextInt();
            
            switch (key) {
               case 1:
                  Cust1 = BankApp.createOb(BankApp.getInfo());
                  break;
               case 2:
                  if(Cust1 == null){
                     System.out.println("Please Create Account first\n\n");
                  }
                  else{
                     BankApp.displayBalance(Cust1);
                  }
                  break;
               case 3:

                     System.exit(0);
                  break;
               default:
                  System.out.println("Enter Proper Option");
            }

         }while(true);
        

        
    }



}