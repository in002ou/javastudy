package ex02_random;

import java.util.UUID;

public class Ex04_UUID {

	public static void main(String[] args) {

		/*
		 	java.util.UUID
		 	1. 전역 고유 식별자(Universal Unique IDentifier)
		 	2. 32개의 16진수와 4개의 하이픈(-)로 구성된 식별자 값
		 */
		
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
		String str = uuid.toString();
		System.out.println(str);
		// 하이픈(-) 모두 없애기 : 모든 하이픈을 빈 문자열로 바꾸기
		String replacedStr = str.replace("-", "");
		System.out.println(replacedStr);
		
	}

}
