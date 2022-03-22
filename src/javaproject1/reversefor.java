package javaproject1;

import java.util.Scanner;

public class reversefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int rev=0,a,i;
	Scanner s=new Scanner(System.in);
	System.out.println("please enter the number");
	int num=s.nextInt();
	
	for(i=1;i<num;i++)
	{
		a=num%10;
		num=num/10;
		rev=rev*10 + a;
	}
	System.out.println("the reverse of the number is " + rev);
}
}