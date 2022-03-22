package javaproject1;

import java.util.Scanner;

public class display {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the digit");
		int num=s.nextInt();
		if(num==1)
		{
			System.out.println("unit");
		}
		else if(num==10)
		{
			System.out.println("ten");
		}
		else if(num==100)
		{
			System.out.println("hundreads");
		}
		else if(num==1000)
		{
			System.out.println("thousand");
		}
		else
		{
			System.out.println("please enter the valid input");
		}
	}

}
