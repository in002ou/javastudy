package parking;

import java.util.Scanner;

public class ParkingLot {

	private String name;
	private Car[] cars;
	private int idx;	// 배열 생성시 인덱스는 따라 만들어줌.
	private Scanner sc;
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
		System.out.println("현재 등록된 차량은 : " + idx + "대");
		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		} else {
			System.out.println("차량번호 >>>");
			String carNo = sc.next();
			System.out.println("모델 >>>");
			String model = sc.next();
			cars[idx++] = new Car(carNo, model);
			System.out.println("차량번호 " + carNo + "차량이 등록되었습니다.");
		}
		
			
		
	}
	public void deleteCar() {
	
	}
	
	public void printAllCars() {
		
	}
	// loop:
	public void manage() {
		while(true) {
			
			System.out.print("1.추가 2.삭제 3.전체 0.종료 >>>");
			
			String choice = sc.next();		// 숫자로 정보를 받으면 사용자가 입력을 잘못했을때 기능이 작동 안함
			//int choice = sc.nextInt();							// 문자열로 받으면 기능이 멈추지 않는다. 즉 정보는 문자열로 받아오는 것이 더 좋다.
			
			switch(choice) {
			case "1":
				addCar();		// addCar 호출
				break;
			case "2":
				deleteCar();	// deleteCar 호출
				break;
			case "3":
				printAllCars();	// printAllCars 호출
				break;
			case "0":
				return;		// manage 메소드 종료	//break loop;			// break 대신 return 사용 break사용시 switch만 빠져 나가 while에서 다시 루프한다 따라서 메소드 전체를 끝내야 한다 혹은 라벨 작업...
			default:
				 System.out.println("존재하지 않는 메뉴입니다.");
			}
			
		}
		
	}
	
	
}
