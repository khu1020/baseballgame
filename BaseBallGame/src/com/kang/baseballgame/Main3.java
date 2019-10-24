package com.kang.baseballgame;

import java.util.Scanner;

public class Main3 {
	public static void setuserNoArray(int[] userNoArray, int[] randomNoArray) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			for (int i = 0; i < randomNoArray.length; i++) {
				System.out.print("값을 입력 해 주세요 : ");
				int value = scan.nextInt();
				if (value > 0 && value < 10) {
					userNoArray[i] = value;
				}
			}

			int s = 0;
			int b = 0;

			for (int i = 0; i < randomNoArray.length; i++) {
				for (int z = 0; z < randomNoArray.length; z++) {
					if (randomNoArray[i] == userNoArray[z]) {
						if (i == z) {
							s++;
						} else {
							b++;
						}
					}
				}
			}

			if (s == randomNoArray.length) {
				System.out.println("축하합니다!! 맞추셨습니다");
				System.out.println("-- 게임종료 --");
				break;
			}
			System.out.printf("s : %d, b : %d, o : %d \n", s, b, randomNoArray.length - (s + b));
		}
		scan.close();
	}
}
