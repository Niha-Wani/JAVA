package javaprograms;
class Queue
{
	boolean flag=false;
	int n;
	synchronized void put(int n) 
	{
	    while(flag)
	    {
	        try
		{
	           wait();
		}
			catch(InterruptedException e) 
			{
			   System.out.println(e);
			}
			this.n=n;
			flag=true;
			System.out.println("put:"+n);
			notify();
	    }
	}
	synchronized int get() 
	{
	     while(!flag) 
	     {
		  try 
		  {
			wait();
		   }
	          catch(InterruptedException e)
		   {
			System.out.println(e);
		   }
		System.out.println("Got:"+n);
		flag=false;
		notify();
		return n;
	      }
	}
}
class Producer implements Runnable
{
	Thread t;
	Queue q;
	Producer(Queue q)
	{
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run() 
	{
	    int i=0;
	    while(true)
	    {
		q.put(i+1);
	     }
	}
  }
class Consumer implements Runnable
{
	Thread t;
	Queue q;
	Consumer(Queue q)
	{
		this.q=q;
		new Thread(this,"Consumer").start();
	}
	public void run()
	{
	     while(true)
	     {
		q.get();
	     }
	}
}
public class ProducerConsumer 
{
    public static void main(String args[]) 
    {
	Queue q=new Queue();
	new Producer(q);
	new Consumer(q);
	System.out.println("Press control c to exit ");
    }
}
