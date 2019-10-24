package com.kang.baseballgame.oop;

public class Game {
	public void startGame(int no_cnt) {
		RandomNumbers rnb = new RandomNumbers(no_cnt);
		Result result = new Result(no_cnt);
		
		while(true) {
			UserNumbers unb = new UserNumbers(no_cnt);
			unb.setUserNumbers();
			
			if(Check.check(result, rnb, unb)) {
				System.out.println("-- 게임 종료 --");
				break;
			}
		}
		
	}
}
