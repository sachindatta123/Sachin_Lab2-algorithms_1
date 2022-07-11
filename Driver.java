package com.java.gl.Driver;

import java.util.Scanner;

import com.java.gl.payMoney.payMoney;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int transactions[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("enter transaction " + (i + 1));
			transactions[i] = sc.nextInt();
		}
		System.out.println("enter the target");
		int target = sc.nextInt();
		payMoney paymoney = new payMoney();
		int no_Of_Days = paymoney.no_Of_Days(transactions, target);
		if (no_Of_Days == -1)
			System.out.println("target is not achieved");
		else
			System.out.println("target is achievable in " + (no_Of_Days));
		sc.close();
	}

}
