package com.lottery.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
	public static void Lottery() {
		Random random = new Random();
		List<String> list= new ArrayList<String>();
		list.add("對面便當");
		list.add("名廚燒臘店");
		list.add("家鄉牛肉麵");
		list.add("通化魷魚羹");
		list.add("香港榮華餐館");
		list.add("八方雲集");
		list.add("池上飯包");
		list.add("呷尚寶早餐");
		list.add("很熱麵店 麵·飯·米粉湯·甜不辣");
		list.add("北平良田刀削麵");
		list.add("CURRY Wu 咖哩飯");
		list.add("一品魯肉飯");
		list.add("江南餐館");
		list.add("文德鍋貼");
		list.add("李家小館 超遠");
		list.add("明月圓古早味-豬腸冬粉 更遠");
		list.add("不知道 隨緣");
		
		
		int[] sixNum = new int[list.size()];
		for (int i=0; i<3; i++){
			sixNum[i] = random.nextInt(list.size());		// 將隨機數(1-49)放入 sixNum[i]
			for (int j=0; j<i;){			// 與前數列比較，若有相同則再取亂數
				if (sixNum[j]==sixNum[i]){	
					sixNum[i] = random.nextInt(list.size());
					j=0;			// 避面重新亂數後又產生相同數字，若出現重覆，迴圈從頭開始重新比較所有數
				}
				else j++;			// 若都不重複則下一個數
			}
		}
		System.out.println("1. "+list.get(sixNum[0]));
		System.out.println("2. "+list.get(sixNum[1]));
		System.out.println("3. "+list.get(sixNum[2]));
			
			
	}
	
}
