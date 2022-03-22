package javaproject1;

import java.util.Scanner;

public class readdigit {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the digit");
		int num=s.nextInt();
		if(num==1)
		{
			System.out.println("one");
		}
		else if(num==2)
		{
			System.out.println("two");
		}
		else if(num==3)
		{
			System.out.println("three");
		}
		else if(num==4)
		{
			System.out.println("four");
		}
		else
		{
			System.out.println("please enter the valid input");
		}
	}

}
