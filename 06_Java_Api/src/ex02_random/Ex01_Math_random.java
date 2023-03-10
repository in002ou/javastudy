package ex02_random;

public class Ex01_Math_random {

	public static void ex01() {

		// java.lang.Math 클래스
		// 일반 확률 일반 매스랜덤
		// 보안코드 시큐어 랜덤
		// 중복되지 않는 랜덤값 UUID
		
		double randNumber = Math.random();	// 0.0 <= 난수 < 1.0
		
		if(randNumber <= 0.1) { 		// 10% 확률
			System.out.println("대박");
			
		} else {
			System.out.println("꽝");
		}
		
	}	

	public static void ex02() {
		
		/*
		 	난수 생성하기
		 	Math.random()					0.0 <= n < 1.0
		 	Math.random() * 3				0.0 <= n < 3.0
		 	(int)(Math.random() * 3)		  0 <= n < 3
		 	(int)(Math.random() * 3) + 1	  1 <= n < 4
			-----------------------------------------------
			(int)(Math.random() * 계수) + 시작값
		*/
		// randdom code 6자리, 0 ~ 9
		StringBuilder sb = new StringBuilder();
		for(int count = 0; count < 6; count++) {
			sb.append((int)(Math.random()* 10));
		}
		String code = sb.toString();
		System.out.println(code);
		
	}
	
	public static void main(String[] args) {

		
		ex01();
		
	}

}
