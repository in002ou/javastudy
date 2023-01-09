package ex02_loop;

public class Ex01_for {
	/*
	 *  for문 
	 *  1. 연속된 숫자를 생성하는 반복문(배열에서 주로 사용)
	 *  2. 형식
	 *  	for(초기문; 조건문; 증감문) {
	 *  	실행문
	 *  	}
	 */
	
	
	
	public static void ex01() {
//		1~10
//		실행 순서 초기문(1)-> 조건문(2) -> 실행문(3) -> 증감문(4) 이후 2->3->4 반복
		for(int a = 1; a <= 10; ++a) {
			System.out.println(a);
		}
		
		
	}
		
	public static void ex02() {

//		횟수 
		int count = 5;
		
		for(int a = 0; a < count; a++) {
			System.out.println("Hello World");
		}
		
	}
	
	public static void ex03() { // 연습
		
//		10 ~ 1
		
		int count = 0;
		
		for(int a = 10; a > count; a--) {
			System.out.println(a);
		}
		
		
	}
	
	public static void ex04() { // 연습

		// 구구단 2단 출력		
		
		int count = 10;
		
		
		for(int dan = 2; dan < 10; dan++) {
			
			for(int a = 1; a < count; a++) {
			
			System.out.println(dan + " X " + a + " = " + dan * a);
		
			}
		
		}
		
		
	}
	
	public static void main(String[] args) {
		ex04();

	}

}
