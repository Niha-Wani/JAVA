package javaprograms;
import java.util.*;
public class Static2 {
	static int a=10;
	static int b;
	static{
		System.out.println("Static block is executed ");
		b= a*20;
	}
     void display(){
		System.out.println("value of a & b = "+a+ " " +b);
	
	}
	public static void main(String args[]) {
	Static2 obj=new Static2();
		obj.display();
}
}
