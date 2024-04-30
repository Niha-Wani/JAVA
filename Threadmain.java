package javaprograms;

public class Threadmain {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		t.setName("Mainthread");
		System.out.println("Currentthread="+t);
		try {
			for(int i=0;i<5;i++) {
				System.out.println("value of i=" +i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
