package com.kang.baseballgame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;

		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];

		Main2 main2 = new Main2();
		main2.setRandomArray(randomNoArray);

		Scanner scan = new Scanner(System.in);

		while (true) {

			Main3 main3 = new Main3();
			main3.setuserArray(scan, userNoArray);

			Main4 main4 = new Main4();
			int s = main4.checkFinish(randomNoArray, userNoArray);

			if (s == randomNoArray.length) {
				System.out.println("축하합니다!! 맞추셨습니다");
				System.out.println("-- 게임종료 --");
				break;
			}
		}
		scan.close();
	}
}
