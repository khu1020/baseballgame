package com.kang.baseballgame.oop;

public class Result {
	public final int NO_COUNT;
	private int strike;
	private int ball;
	private int out;

	public Result(int no_count) {
		NO_COUNT = no_count;
	}

	public void setValues(int strike, int ball) {
		this.strike = strike;
		this.ball = ball;
	}

	public void showResult() {
		System.out.printf("S : %d, B : %d, O : %d \n", strike, ball, NO_COUNT - (strike + ball));
	}
}
