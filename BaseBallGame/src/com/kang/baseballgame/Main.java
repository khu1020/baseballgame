package com.kang.baseballgame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;

		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];

		Main2 main2 = new Main2();
		main2.setRandomArray(randomNoArray);

		Main3 main3 = new Main3();
		main3.setuserNoArray(userNoArray, randomNoArray);
	}

}
