package prac3;

import java.util.HashMap;
import java.util.Map;

public class Bakery {

	// 필드
		private int breadCount;  // 판매하는 빵의 개수
		private int breadPrice;  // 판매하는 빵의 가격
		private int bakeryMoney; // 빵집에 있는 돈
		
		// 생성자
		public Bakery(int breadCount, int breadPrice, int bakeryMoney) {
			this.breadCount = breadCount;
			this.breadPrice = breadPrice;
			this.bakeryMoney = bakeryMoney;
		}

		// 판매 메소드
		// 구매자에게 돈을 받는다. 구매자에게 빵과 잔돈을 준다.
		public Map<String, Object> sell(int money) {
			
			// 판매할 빵의 개수
			int sellBread = money / breadPrice;
			
			// 잔돈
			int change = money % breadPrice;
			
			// 고객에게 돌려 줄 BreadAndChange 객체 생성
			Map<String, Object> bnc = new HashMap<String, Object> ();
			
			// Bakery 판매처리(빵은 줄었고, 돈은 늘었다.)
			bnc.put("sellBread", sellBread);
			bnc.put("change", change);
			
			breadCount -= (int)bnc.get("sellBread");
			bakeryMoney += (money - (int)bnc.get("change"));
			
			// 고객에게 빵과 잔돈 반환
			return bnc;
			
		}
		
		// 판매 현황 메소드
		public void info() {
			System.out.println("남은 빵 : " + breadCount + "개");
			System.out.println("현재 돈 : " + bakeryMoney + "원");
		}
	
}
