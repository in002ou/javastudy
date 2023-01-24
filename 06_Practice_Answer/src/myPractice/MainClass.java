package myPractice;

import java.security.SecureRandom;
import java.util.Scanner;

public class MainClass {

	public static void ex08() {
//		대문자와 소문자와 숫자로 구성된 인증번호를 만드시오.
		// 사용자로부터 몇 자리의 인증번호를 만들것인지 입력 받아서 처리하시오.
		// 대문자와 소문자와 숫자는 임의로 섞으시오.
		// 예시)
		// 몇 자리의 인증번호를 생성할까요? >>> 6
		// 생성된 6자리 인증번호는 Fa013b입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 자리 인증번호를 생성할까요 >>" );
		int count = sc.nextInt();
		SecureRandom secureRandom = new SecureRandom();
		StringBuilder sbCode = new StringBuilder();
		for(int n = 0; n < count; n++) {
			double randNumber = secureRandom.nextDouble();
			if(randNumber < 0.33) {
				sbCode.append((char)((int)(secureRandom.nextDouble() * 26) + 'A'));
			} else if(randNumber < 0.66) {
				sbCode.append((char)((int)(secureRandom.nextDouble() * 26) + 'a'));
			} else {
				sbCode.append((char)((int)(secureRandom.nextDouble() * 10) +'0'));
			}
		}
		String code = sbCode.toString();
		System.out.println("생성된 " + count + "자리 인증번호는 " + code + "입니다.");
		sc.close();
	}
	
	public static void main(String[] args) {

		ex08();
	}

}
