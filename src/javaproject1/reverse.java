package javaproject1;

import java.util.Scanner;

public class reverse {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rev=0,a;
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the number");
		int num=s.nextInt();
		
		while(num>0)12
		{
			a=num%10;
			num=num/10;
			rev=rev*10 + a;
		}
		System.out.println("the reverse of the number is " + rev);
	}

}
