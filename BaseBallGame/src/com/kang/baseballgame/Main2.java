package com.kang.baseballgame;

public class Main2 {
	public static void setRandomArray(int[] randomNoArray) {

		for (int i = 0; i < randomNoArray.length; i++) {
			int randomValue = (int) (Math.random() * 9 + 1);

			for (int j = 0; j < randomNoArray.length; j++) {
				if (randomNoArray[j] == randomValue) {
					i--;
					break;
				} else if (randomNoArray[j] == 0) {
					randomNoArray[j] = randomValue;
					break;
				}
			}
		}
	}
}