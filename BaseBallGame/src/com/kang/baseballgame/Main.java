package com.kang.baseballgame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final int NO_COUNT = 3;

		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];

		for (int i = 0; i < NO_COUNT; i++) {
			int randomValue = (int) (Math.random() * 9 + 1);

			for (int j = 0; j < NO_COUNT; j++) {
				if (randomNoArray[j] == randomValue) {
					i--;
					break;
				} else if (randomNoArray[j] == 0) {
					randomNoArray[j] = randomValue;
					break;
				}
			}
		}

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < NO_COUNT; i++) {
			System.out.print("값을 입력 해 주세요 : ");
			int value = scan.nextInt();
			if (value > 0 && value < 10) {
				userNoArray[i] = value;
			} else {
				System.out.printf("값을 잘 못 입력 하였습니다. 다시 입력해주세요. \n");
				i = -1;
			}
		}
		scan.close();

		System.out.printf("Value : ");

		for (int str : userNoArray) {
			System.out.printf("%d ", str);
		}

	}
}
