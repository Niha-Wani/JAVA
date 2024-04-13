package javaprograms;
import java.util.*;
public class Stringfloat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String x=sc.nextLine();
		float z=Float.parseFloat(x);
		System.out.println("After type casting the number is " +z);
	}

}
