package javaprograms;
import java.util.*;
class Test{
	void meth(int i,int j) {
		i=i*10;
		j=j+2;
	}
}
public class Callbyvalue {
public static void main(String args[]) {
	int a=10, b=20;
	Test obj=new Test();
	obj.meth(a, b);
	System.out.println("Value of a= " +a+ " b= " +b);
	
}
}
