package ex01_File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainClass {
	
	/*
		 	File 클래스
		 	1. java.io 패키지
		 	2. 파일, 디렉터리(폴더)를 관리하는 클래스
		 	3. 객체 생성 방법
		 		1) new File(경로, 파일명)
		 		2) new File(파일명)
		 	4. 경로 구분 방법
		 		1) 윈도우 : 백슬래시(\)
		 		2) 리눅스 : 슬래시(/)
	 */

	public static void ex01() {
		
		// File.separator : 플랫폼에 따라서 자동으로 경로 구분자를 사용.
		
		// 디렉터리 관련 필수 작업
		
		File dir = new File("C:" + File.separator + "storage");		
//		File dir = new File("C:\\storage");		// 이스케이프 문자때문에 \를 두 번 넣어줘야 자바 프로그램에서 \를 인식.
		
		// 없으면 만들고. 있으면 지운다.
		if(dir.exists() == false) {
			dir.mkdirs();		// 디렉터리 만드는 명령.
			System.out.println("C:" + File.separator + "storage 생성 완료");
		} else {
//			dir.delete();		// 지금 바로 지운다.
			dir.deleteOnExit(); // JVM 실행이 끝나면 지운다.
			System.out.println("C:" + File.separator + "storage 삭제 완료");
		}
	}
	
	public static void ex02() throws IOException {		// 예외 처리를 ex02 메소드를 호출한 곳으로 넘긴다.
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
			File file = new File(dir, "myfile.txt"); 	
			if(file.exists() == false) {
				file.createNewFile();					// Checked Exception이므로 반드시 예외 처리가 필요한 코드
			} else {
				file.delete();
			}
	}
	
	public static void ex03 () throws IOException {
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
			
		}
		File file = new File(dir, "myfile.txt");
		if(file.exists() == false) {
			file.createNewFile();
		}
		
		// 파일의 정보 확인
		System.out.println("파일명 : " + file.getName());
		System.out.println("디렉터리명 : " + file.getParent());
		System.out.println("경로명 : " + file.getPath());	// 파일명 + 디렉터리명
		
		System.out.println("디렉터리인가? " + file.isDirectory());
		System.out.println("파일인가? " + file.isFile());
		
		long lastModified = file.lastModified();	// 최종 수정일의 타임 스탬프 값
		System.out.println("최종 수정일 : " + lastModified);
		String lastModifiedDate = new SimpleDateFormat("yyyy-MM-dd").format(lastModified);
		System.out.println("최종 수정일 : " + lastModifiedDate);
		
		long size = file.length();	// 파일의 크기가 바이트 단위로 저장
		long kb = (size / 1024) + (size % 1024 != 0 ? 1 : 0);
		
		System.out.println("파일 크기 : " + kb + "KB");	// 킬로 바이트 출력(1024바이트는 1kb와 같다)
	}
	
	public static void ex04() {
		
		File dir = new File("C:" + File.separator + "Program Files");
		
		File[] files = dir.listFiles();		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isHidden() == false) {
				System.out.println(files[i].getName());
			}
		}
	}
	
	public static void main(String[] args) {
		ex04();
	}

}
