package practice02_Person_Array;

public class Person {
	
	// 필드
	private String name;
	private int age;
	
	
	// 생성자
	public Person() {	}	// new Person() 디폴트 생성자는 하나라도 생성자를 만들지 않았을 때 사용
	public Person(String name, int age) {		// new Person("alice", 20)
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
