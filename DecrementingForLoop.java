package com.kn.decrementingforloop;

import java.util.Scanner;

public class DecrementingForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int n=scan.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
	}

}
