package com.kang.baseballself;

public class Number {
	public final int NO_COUNT = 3;
	public int[] array = new int[NO_COUNT];
	
	public Number () {}
	
	public boolean numberTrue(int randomValue) {
		boolean result = true;
		for(int i = 0; i < NO_COUNT; i++) {
			if(array[i] == 0) {
				array[i] = randomValue;
				break;
			} else if(array[i] == randomValue) {
				result = false;
				break;
			}
		}
		return result;
	}
}
