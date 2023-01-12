package ex01_one_dim;

public class Ex02_reference {

	public static void ex01() {
		
		int[] arr;	//reference(참조값) = address(주소값)
		
		arr = new int[5];
		
		System.out.println(arr);  // 5개 배렬 요소의 참조값
		
	}
	
	public static void ex02() {
		
		int[] a = new int[5];  //b에 a를 저장하여 같은 주소를 가진다.
		int[] b;			  // b에 값을 저장하고 a에서 불러와도 값이 같다.
		
		b = a;
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		
		/*
        |-------|
      a | 0x123 |──────────┐    
        |-------|          │   	16진수0x or 0X
        |  ...  |          │
        |-------|          │
   a[0] |   0   | 0x123    │ 
        |-------|          │
   a[1] |   0   |          │
        |-------|          │
   a[2] |   0   |          │ b = a;
        |-------|          │
   a[3] |   0   |          │
        |-------|          │
   a[4] |   0   |          │
        |-------|          │
        |  ...  |          │
        |-------|          │
      b | 0x123 |◀─────────┘
        |-------|
	*/
		
	}
	
	public static void ex03() {
		
//		생성된 배열의 크기를 늘이는 방법
//		기존 배열
		int[] a = new int[5];
//		신규 배열
		int[] b = new int[10];
		
//		기존 배열 요소 -> 신규 배열 요소
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
//		기존 배열의 참조값을 신규 배열의 참조값으로 수정
		a = b;
		
//		기존 배열이 신규 배열로 변경되었으므로 확인
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	public static void main(String[] args) {
		ex03();
		
	}

}
