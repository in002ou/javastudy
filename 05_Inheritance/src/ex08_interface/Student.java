package ex08_interface;

/*
 	용어 정리
 	1. 클래스를 상속 받는다. extends 키워드 사용
 		public class Person {}
 		public class Student extends Person{}
 	
 	2. 인터페이스를 구현한다. implements 키워드 사용
 		public interface Person {}
 		public class Student implements Person {}
 */

public class Student implements Person {
	
	@Override
	public void study() {	// 추상 메소드 오버라이드
		System.out.println("공부한다.");
	}

}
