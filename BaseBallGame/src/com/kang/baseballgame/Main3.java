package com.kang.baseballgame;

import java.util.Scanner;

public class Main3 {
	public static void setuserArray(Scanner scan, int[] userNoArray) {
		
			for (int i = 0; i < userNoArray.length; i++) {
				System.out.print("값을 입력 해 주세요 : ");
				int value = scan.nextInt();
				if (value > 0 && value < 10) {
					userNoArray[i] = value;
				}
			}
	}
}
