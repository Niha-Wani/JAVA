package javaprograms;
class Callme implements Runnable
{
	synchronized void call(String S) 
	{
	   System.out.println("[" +S);
	   try 
	   {
	     Thread.sleep(1000);
	   }
	   catch(InterruptedException e) 
	   {
	      System.out.println(e);
	   }
	   System.out.println("]");
	}
}
class Caller implements Runnable
{
	Thread t;
	String S;
	Callme target;
	Caller(String name,Callme t)
	{
		S=name;
		target=t;
		t=new Thread(this,"Mythread");
		t.start();
	}
	public void run() 
	{
		synchronized(target)
		{
		  target.call(S);
	        }
        }
public class Synchronized
{
    public static void main(String args[]) 
    {
      Callme t=new Callme();
      Caller obj1=new Caller("HELLO",t);
      Caller obj2=new Caller("NIHA",t);
      Caller obj3=new Caller("INJILA",t);
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
     }
}
