package com.kang.baseballgame;

public class Main4 {
	public static int checkFinish(int[] randomNoArray, int[] userNoArray) {
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
		System.out.printf("s : %d, b : %d, o : %d \n", s, b, randomNoArray.length - (s + b));
		
		return s;
	}
}
