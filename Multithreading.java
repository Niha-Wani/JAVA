package javaprograms;
class Newthread implements Runnable{
	Thread t;
		Newthread(){
	t=new Thread(this,"MyThread");
	System.out.println("thread created "+t);
	t.start();
}
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println(t+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
public class Multithreading {
public static void main(String args[]) {
	new Newthread();
	try {
		for(int i=0;i<10;i++) {
			System.out.println("value of i="+i);
			Thread.sleep(1000);
		}
	}
	catch(InterruptedException e) {
		System.out.println(e);
	}
	System.out.println("Mainthread exiting");
}
}
