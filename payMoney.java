package com.java.gl.payMoney;

public class payMoney {

	public int no_Of_Days(int transactions[], int target) {
		for (int i = 0; i < transactions.length; i++) {
			if (transactions[i] > target || transactions[i] == target)
				return i + 1;
			else {
				target = target - transactions[i];

			}
		}
		return -1;

	}

}
