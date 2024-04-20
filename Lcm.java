package javaprograms;
import java.util.Scanner;
public class Lcm {
	public static void main(String args[]) {
    	int a,b,i,hcf=0;
    	Scanner sc=new Scanner (System.in);
    	System.out.println("Enter the first number");
    	a=sc.nextInt();
    	System.out.println("Enter the second number");
    	b=sc.nextInt();
    	for(i=1;i<=a||i<=b;i++) {
    		if(a%i==0 && b%i==0)
    			hcf=i;
	}
    	int lcm=a*b/hcf;
    	System.out.println("LCM = " +lcm);
}
}