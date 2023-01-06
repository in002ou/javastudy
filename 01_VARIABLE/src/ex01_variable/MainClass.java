package ex01_variable;

public class MainClass {

	// single comment - 한 줄 주석(코드 설명 역할)
	/*
	  	multiple comment 여러 줄 주석
	 */
	/*
		키워드 이름 규칙
		1. 프로젝트 : 마음대로
		2. 패키지 : 소문자. 실무의 경우-> 회사 도메인, 앱 이름 예) com.samsung.galaxy
		3. 클래스 : 첫 글자 대문자 이후 소문자 방식 upper camel case HelloWorld
		4. 메소드 : 첫 글자 대문자 작성 이후 소문자 방식- lower camel case helloWorld
		5. 변수 : 첫 글자 대문자 작성 이후 소문자 방식- lower camel case 
		6. 상수 : 모두 대문자 snake case 방식 HELLO_WORLD 가독성을 위해 언더바
	*/
	
	/*
	  main 메소드 
	  1. java 실행될 때 main 메소드 실행된다.
	  2. 열린 main 메소드가 없으면 최근에 실행에 성공한 main 메소드를 실행
	 */
	
	public static void main(String[] args) {
		
		// 코드는 들여쓰기 잘 하셈ㅇㅇ *^*
		
		// 변수 선언하기(어떤 데이터를 저장할 것이가, 어떤 이름을 사용할 것인가)
		
		// 타입의 구분
		// 1. primitive type : 기본 타입 (소문자로 되어 있음), 값을 저장하는 타입
		// 2. reference type : 참조 타입 (첫 글자 대문자, 모든 클래스는 참조 타입), 값이 저장된 참조값을 저장하는 타입
		
		
		// 논리 타입
		boolean isGood = true;
		boolean isAlive = false;
		System.out.println(isGood);
		System.out.println(isAlive);
		
		// 문자 타입(character) : 1글자
		char ch1 = 'A';
		char ch2 = '홍';
		char ch3 = '\n';	// 라인 피드 - 줄 바꿈
		char ch4 = '\t';	// 탭
		char ch5 = '\'';	// 작음 따옴표 이스케이프 처리
		char ch6 = '\"';	// 마찬가지
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		// 정수 타입
		int age = 46;
		long money = 10000000000L;
		System.out.println("나이 : " + age);
		System.out.println("재산: " + money);
		
		// 정수 구분의 기준
		System.out.println(Integer.MAX_VALUE);
		
		// 실수 타입 float 잘 안쓴다 자바에서
		double leftEye = 0.7;
		double rightEye = 1.2;
		System.out.println("좌시력: " + leftEye);
		System.out.println("우시력: " + rightEye);
		
		// 문자열 타입 (여러 글자, 글자 수 제한 없음)reference 타입
		String name = "take a look";	// java에서 기본 타입과 같은 사용법을 제공
		System.out.println("이름: " + name);
		String country = new String("street");	// 대부분의 참조 타입 사용범
		System.out.println("국적: " + country);
		
		// 상수 선언하기(final 키워드 필요)
		final double PI = 3.141592;
		System.out.println(PI);
		
		
		
	}

	
	
}
