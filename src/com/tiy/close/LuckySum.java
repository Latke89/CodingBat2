package com.tiy.close;

/**
 * Created by Brett on 9/21/16.
 */
public class LuckySum {

	public static void main(String[] args) {
		LuckySum myNumber = new LuckySum();
//		System.out.println(myNumber.luckySum());

	}

	public int luckySum(int a, int b, int c) {
		if (a == 13) {
			return 0;
		} else if (b == 13) {
			return a;
		} else if (c == 13) {
			return a + b;
		} else {
			return a + b + c;
		}
	}

}
