package javaprograms;
import java.util.*;
public class Recursion {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of array ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("The elements are ");
	display(arr,0);
}
public static void display(int arr[],int index) {
	if(index==arr.length) {
		return;
	}
	System.out.print(arr[index]);
	display(arr,index+1);
}
}
