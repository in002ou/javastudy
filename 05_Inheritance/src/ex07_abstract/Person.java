package ex07_abstract;

/*
 	추상 메소드
 	1. abstract method
 	2. 본문이 없는 메소드.
 	3. 중괄호를 없애고, 세미콜론, abstract 키워드 추가(메소드 앞에)
 */

/*
  	추상 클래스
  	1. abstract class
  	2. 추상 메소드를 1개 이상 가진 클래스이다.
  	3. 클래스 앞에 abstract 키워드 추가
  	4. 추상 클래스를 상속 받는 클래스는 "반드시" "모든" "추상 메소드"를 오버라이드 해야 한다. 
  	5. 추상 클래스는 객체 생성이 불가능하다.
  		(본문이 없는 메소드를 가지고 있기 때문에 객체 생성을 할 수 없다.
 */

public abstract class Person {	// 추상 클래스

	public void eat() {
		System.out.println("먹는다.");
	}
	public void sleep() {
		System.out.println("잔다.");
	}

	public abstract void study();	// 본문이 없는 메소드 (추상 메소드)
		
}
