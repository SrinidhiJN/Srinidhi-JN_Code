package com.intro.java;
import java.util.Scanner;

public class TakeUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 nos");;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int c = num1+num2;
		System.out.print("output is "+ c);
		
		
	}

}
