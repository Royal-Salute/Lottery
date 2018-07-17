package com.lottery.main;

import com.lottery.code.Lottery;

public class index {

	public static void main(String[] args) {
		for(int i = 1 ; i<=10;i++) {
			new Lottery().Lottery();
			System.out.println("************************");
		}
		System.out.println("exit");
	}

}
