package javaprograms;
class Newth implements Runnable
{
	String name;
	Thread t;
	Newth(String name)
	{
	    name=this.name;
	    t=new Thread(this,"MYRULES");
	    System.out.println("Thread created " +t);
	    t.start();
         }
	public void run() 
	{
	        try 
		{
		    for(int i=0;i<10;i++)
		    {
			System.out.println("value of i is " +i);
			Thread.sleep(1000);
		    }
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
public class Joinmain 
{
	public static void main(String args[]) 
	{
             Newth obj1=new Newth("one");
             Newth obj2=new Newth("Two");
             Newth obj3=new Newth("Three");
             obj1.t.isAlive();
	     try 
	     {
		   obj1.t.join();
		   obj2.t.join();
		   obj3.t.join();
	     }
	     catch(InterruptedException e) 
	      {
		   System.out.println(e);
	      }
		obj1.t.isAlive();
		System.out.println("Mainthread exiting");
	}
  }
