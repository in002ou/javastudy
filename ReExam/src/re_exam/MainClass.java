package re_exam;

import java.util.Arrays;

public class MainClass {

	// 문제1. 절대값 구하기
	public static void ex01() {
		int number = -5;
		int absNumber = (number >= 0) ? number : -number;
		
		System.out.println(absNumber);
	}
	
	// 문제2. 나이에 따른 구분하기
	// 0 ~ 7 : 미취학 아동
	// 8 ~ 13 : 초등학생
	// 14 ~ 16 : 중학생
	// 17 ~ 19 : 고등학생
	// 20 ~ 100 : 성인
	// 나머지 : 잘못된 나이
	public static void ex02() {
		String strAge = "30";
		int age = Integer.parseInt(strAge);
		
		if(age < 0 || age > 100) {
			System.out.println("잘못된 나이");
			return;
		} else if(age <= 7) {
			System.out.println("미취학 아동");
		} else if(age <= 13) {
			System.out.println("초등학생");
		} else if(age <= 16) {
			System.out.println("중학생");
		} else if(age <= 19) {
			System.out.println("고등학생");
		} else {
			System.out.println("성인");
		}
	}
	
	// 문제3. 삼각형 넓이 구하기
	public static void ex03() {
		
		int width = 3;
		int height = 3;
		double area = width * height / 2.0;
		
		System.out.println(area);
	}
	
	// 문제4. 월 -> 계절과 마지막 일 출력하기
	public static void ex04() {
		/* month % 12 /3
		   겨울 : 0
		   봄 	: 1
		   여름 : 2
		   가을 : 3
		*/		
		int month = 12;
		String[] season = {"겨울", "봄", "여름", "가을"};
		int[] lastDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(month < 0 || month > 12) {
			System.out.println(month + "월은 잘못된 입력입니다");
			return;
		}
		System.out.println(month + "월은 " + season[month % 12 / 3] + "입니다.");
		System.out.println(month + "월은 " + lastDay[month - 1] + "일까지 있습니다.");
		
	}
	
	
	// 문제5. 10과 가까운 수 찾기
	public static void ex05() {
		int a = 8;
		int b = 11;
		int diff1 = (a > 10) ? a - 10 : 10 - a;
		int diff2 = (b > 10) ? b - 10 : 10 - b;
		System.out.println("10과 가까운 수는 " + (diff1 < diff2 ? a : b) + "입니다.");
	}
	
	// 문제6. money 분리하기
	public static void ex06() {
		
		int money = 87654;
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] count = new int[unit.length];
		
		for(int i = 0; i < unit.length; i++) {
			count[i] = money / unit[i];
			money %= unit[i];
			System.out.println(unit[i] + "원권 " + count[i] + "개");
		}
		System.out.println(Arrays.toString(unit));
		System.out.println(Arrays.toString(count));
	}
	
	// 문제7. 2차월 배열에 구구단 결과 저장하기
	public static void ex07() {
		
		int[][] arr = new int[8][9];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 2) * (j + 1);
				System.out.print(String.format("%3d", arr[i][j]) );
				
			}
			System.out.println();
		}
		System.out.println("------------");
		
		for(int i =0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("------------");
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}
	
	
	public static void main(String[] args) {
		ex07();
	}

}
