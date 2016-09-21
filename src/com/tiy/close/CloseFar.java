package com.tiy.close;

/**
 * Created by Brett on 9/21/16.
 */
public class CloseFar {

	public static void main(String[] args) {
		CloseFar myTest = new CloseFar();
		System.out.println(myTest.closeFar(10, 8, 12));
	}

	public boolean closeFar(int a, int b, int c) {

		if (a == b && a == c) {
			return false;
		} else if ((Math.abs(a - b) == 1) && (Math.abs(b - c) == 1)) {
			return false;
		} else if ((Math.abs(a - b) >= 2) && (Math.abs(a - c) >= 2)) {
			return false;
		} else if ((Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c))) == 2) {
			return false;
		} else if (((a == b) || (a == c)) && (((Math.abs(a - b) >= 2) || (Math.abs(a - c) >= 2)))) {
			return true;
		}

		return true;
	}
}
