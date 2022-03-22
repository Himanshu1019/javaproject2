package javaproject1;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the digit");
		int num=s.nextInt();
		while(i<=num)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("the addition of the numbers is"+sum);
	}

}
