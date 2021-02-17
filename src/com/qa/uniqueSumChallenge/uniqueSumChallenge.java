package com.qa.uniqueSumChallenge;

public class uniqueSumChallenge {

	public static void main(String[] args) {

		System.out.println(Input(1, 2, 3));
		System.out.println(Input(3, 3, 3));
		System.out.println(Input(1, 1, 2));

	}

	public static int Input(int x, int y, int z) {

		if (x == y && x == z) {
			x = 0;
			y = 0;
			z = 0;
		} else if (x == y) {
			x = 0;
			y = 0;
		} else if (x == z) {
			x = 0;
			z = 0;
		} else if (y == z) {
			z = 0;
			y = 0;
		}

		return x + y + z;
	}

}
