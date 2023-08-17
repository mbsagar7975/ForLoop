package com.kn.selection;

import java.util.Scanner;

public class TableCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int n=scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		scan.close();
	}

}
