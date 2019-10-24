package com.kang.baseballgame.oop;

public class Check {
	public static boolean check(Result res, Numbers num1, Numbers num2) {
		boolean result = false;
		
		int[] num1Array = num1.getArray();
		int[] num2Array = num2.getArray();
		
		int s = 0, b = 0;
		
		for(int i = 0; i < res.NO_COUNT; i++) {
			for(int z = 0; z < res.NO_COUNT; z++) {
				if(num1Array[i] == num2Array[z]) {
					if(i == z) {
						s++;
					}
					else {
						b++;
					}
				}
			}
		}
		
		res.setValues(s, b);
		res.showResult();
		
		if(s == res.NO_COUNT) {
			result = true;
		}
		
		return result;
	}
}
