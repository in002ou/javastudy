package ex01_field;

public class MainClass {

	public static void main(String[] args) {

		// User 타입의 객체 선언
		User user1;
		
		// User 타입의 객체 생성
		user1 = new User();
		
		// 객체 user1의 필드 활용
		user1.id = "admin";
		user1.pw = "123456";
		user1.point = 100;
		user1.isVip = false;
		
		// user1의 addr 필드 생성(Address 클래스 타입이기 때문에 반드시 new를 이용해 생성해야 한다.)
		user1.addr = new Address();
		
		user1.addr.postCode = "12345";
		user1.addr.roadAddress = "디지털로";
		user1.addr.jibunAddress = "가산동";
		
		System.out.println("아이디 : " + user1.id);
		System.out.println("비밀번호 : " + user1.pw);
		System.out.println("포인트 : " + user1.point);
		System.out.println("VIP 여부 : " + user1.isVip);
		System.out.println("주소 : " + user1.addr.postCode + " " + user1.addr.roadAddress + "(" + user1.addr.jibunAddress + ")");
		
		// 개별 연습
		// 다음 값을 가지는 객체 user2를 생성해 보세요.
		
		// 아이디 : master
		// 비밀번호 : 654321
		// 포인트 : 1000
		// VIP 여부 : true
		// 주소 : 54321 디지털로(철산동)
		
		User user = new User();		// 객체 선언, 생성
		
		user.id = "master";			//필드 값 저장
		user.pw = "654321";
		user.point = 1000;
		user.isVip = true;
		
		user.addr = new Address();
		
		user.addr.postCode = "54321";
		user.addr.roadAddress = "디지털로";
		user.addr.jibunAddress = "철산동";
		
		System.out.println("아이디 : " + user.id);
		System.out.println("비밀번호 : " + user.pw);
		System.out.println("포인트 : " + user.point);
		System.out.println("VIP 여부 : " + user.isVip);
		System.out.println("주소 : " + user.addr.postCode + " " + user.addr.roadAddress + "(" + user.addr.jibunAddress + ")");
	}

}
