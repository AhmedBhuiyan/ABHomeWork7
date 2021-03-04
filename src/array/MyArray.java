package array;

import java.util.Scanner;

public class MyArray {

	public static void main(String[] args) {
		int [] num=new int[10];
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter you number ");
		
		
		
		for (int i=0;i<num.length;i++) {
		num[i]=sc.nextInt();
		}
		
		for (int i=0; i<num.length; i++) {
		
		System.out.println(num[i]);
		}
		sc.close();
		
	}
	

}
