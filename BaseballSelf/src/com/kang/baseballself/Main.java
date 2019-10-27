package com.kang.baseballself;

public class Main {
	public static void main(String[] args) {
		Random ran = new Random();
		
		ran.randomNumber();

		for(int i = 0; i < ran.NO_COUNT; i++) {
			System.out.printf("%d ", ran.array[i]);
		}
	}
}
