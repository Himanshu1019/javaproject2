package javaproject1;

import java.util.Scanner;

public class sumfor {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=15,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the digit");
		int num=s.nextInt();
		for(i=1;i<=num;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("the addition of the numbers is"+sum);
	}

}
