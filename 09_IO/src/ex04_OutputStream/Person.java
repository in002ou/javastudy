package ex04_OutputStream;

import java.io.Serializable;

/*
 	ObjectOutoutStream/ObjcetInputStream을 통해서
 	객체 입출력을 수행하려면 "반드시" 직렬화 처리를 해야한다.
 */

/*
 	직렬화 처리 방법
 	1. java.io.Serializable 인터페이스를 구현(implements)한다.
 	2. serialVersionUID 필드 값을 정의한다.
 */
public class Person implements Serializable {

	private static final long serialVersionUID = -5818574910089539827L;
	private String naem;
	private int age;
	private double height;
	private boolean isAlive;
	
	public Person() {
		
	}

	public Person(String naem, int age, double height, boolean isAlive) {
		super();
		this.naem = naem;
		this.age = age;
		this.height = height;
		this.isAlive = isAlive;
	}

	public String getNaem() {
		return naem;
	}

	public void setNaem(String naem) {
		this.naem = naem;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	@Override
	public String toString() {
		return "Person [naem=" + naem + ", age=" + age + ", height=" + height + ", isAlive=" + isAlive + "]";
	}


	
	
	
	
}
