package com.kang.baseballgame;

public class Main {
	public static void main (String[] args) {
		final int NO_COUNT = 9;
		
		int[] randomNoArray = new int[NO_COUNT];
		int[] userNoArray = new int[NO_COUNT];
		
		for(int i = 0; i < NO_COUNT; i++) {
			int randomValue = (int)(Math.random() * 9 + 1);
			
			for(int j = 0; j < NO_COUNT; j++) {
				if(randomNoArray[j] == randomValue) {
					i--;
					break;
				}
				else if (randomNoArray[j] == 0) {
					randomNoArray[j] = randomValue;
					break;
				}
			}
		}
		for(int str : randomNoArray) {
			System.out.printf("%d ", str);
		}
		
	}
}
