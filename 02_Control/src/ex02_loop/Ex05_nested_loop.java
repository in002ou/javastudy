package ex02_loop;

public class Ex05_nested_loop {

	public static void ex01() {
		
		int day = 1;
		
		while(day <= 5) {
			int hour = 1;
			
			while(hour <= 8) {
				System.out.println(day + "일차 " + hour + "교시");
				hour++;
			}
			System.out.println();
			day++;
			
		}
		
	}
	
	public static void ex02() {
		
		for(int n = 1; n <= 9; n++) {
			for(int dan = 2; dan <= 9; dan ++) {
				System.out.print(dan + " X " + n + " = " + (dan * n) + "\t");
			}
			System.out.println();
		}
		
	}
	
	public static void ex03() {
		
		int count = 1;
		
		
	}
	
	public static void main(String[] args) {
		ex02();
		
		
	}

}
