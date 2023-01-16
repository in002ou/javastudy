package ex06_downcasting;

public class MainClass {

	public static void ex01() {
		
		Person person = new Student();	//업 캐스팅 자식을 부모타팁으로 저장.
		/*
	 	업 캐스팅 문제점 해결 방법 두가지
	 	1. 슈퍼 클래스에 서브 클래스의 메소드를 오버라이드 하는 방법
	 	2. 업 캐스팅 된 서브 클래스의 객체를 다시 서브 클래스 타입으로 변환
	 		다운 캐스팅.
		 */
		
		
		// downcasting
		Student student = (Student)person;
		
		student.eat();
		student.sleep();
		student.study();
		
	}
	
	public static void ex02() {
		
		// Person
		Person person = new Person();	
		
		// 잘못된 캐스팅
		Student student = (Student)person;
		
		// 캐스팅은  컴파일 오류로 걸러지지 않는다.
		student.eat();
		student.sleep();
		student.study(); // 오류 발생 부분.
		
	}
	
	public static void ex03() {
		
		// Person
		Person person = new Person();
		
		// Student 객체(인스턴스. instance)가 맞다면 Student 타입으로 캐스팅하자.
		if(person instanceof Student) {
			Student student = (Student)person;
			student.eat();
			student.sleep();
			student.study();
			
			person.eat();	// 서로 다른 곳에 있음을 알려줌
			person.sleep();
			((Student)person).study();
			
			
		}
		
	}
	
	public static void main(String[] args) {

		ex01();
	
	}

}
