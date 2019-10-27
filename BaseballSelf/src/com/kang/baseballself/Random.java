package com.kang.baseballself;

public class Random extends Number {
	private int count = 0;
	public void randomNumber() {
		while(count < NO_COUNT) {
			int randomValue = (int) (Math.random() * 9 + 1);
			if(numberTrue(randomValue)) {
				count++;
			}
		}
	}
}
