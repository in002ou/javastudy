package practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainClass {

	
	// 문제1. 현재 시간을 이용하여 디렉터리를 생성하시오.
	// 예시)
	// C:\14\31\30
	public static void ex01() {
		Calendar now = Calendar.getInstance();
		
		int hour24 = now.get(Calendar.HOUR_OF_DAY); 	// LocalTime 사용해도 댐.
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		String sep = File.separator; 	// 문장이 너무 길어져서 줄여서 쓰자.
		File dir = new File("C:" + sep + hour24 + sep + minute + sep + second);
		
		if(dir.exists() == false) {
			dir.mkdirs();		// 디렉터리 만드는 명령.
			System.out.println("C:" + sep + hour24 + sep + minute + sep + second +" 생성 완료");
		} else {
//			dir.delete();		// 지금 바로 지운다.
			dir.deleteOnExit(); // JVM 실행이 끝나면 지운다.
			System.out.println("C:" + sep + hour24 + sep + minute + sep + second +" 삭제 완료");
		}
	}
	
	// 문제2. C:\Program Files\Java\jdk-11.0.17 경로의 파일 목록을 아래와 같이 출력하시오.
		/*
		2023-01-04  오후 02:19    <DIR>          bin
		2023-01-04  오후 02:19    <DIR>          conf
		2023-01-04  오후 02:19    <DIR>          include
		2023-01-04  오후 02:19    <DIR>          jmods
		2023-01-04  오후 02:19    <DIR>          legal
		2023-01-04  오후 02:19    <DIR>          lib
		2023-01-04  오후 02:19               160 README.html
		2023-01-04  오후 02:19             1,302 release
		               2개 파일               1,462 바이트
		*/
	
	public static void ex02() {
		String sep = File.separator;
		File dir = new File("C:" + sep + "Program Files" + sep + "Java" + sep + "jdk-11.0.17");
		int count = 0;
		long total = 0;
		if(dir.exists()) {
			File[] files = dir.listFiles();
			/*
			  for(File file : files) {
			  	if(file.isHidden()) {	// 숨긴 파일은 제외하겠다.
			  		continue;
			  		}
			  }
			 */
			for(int i = 0; i < files.length; i++) {
				String lmd = new SimpleDateFormat("yyyy-MM-dd a hh:mm").format(files[i].lastModified());
				if(files[i].isFile()) {
					long size = files[i].length();
					System.out.println(lmd + " " + size + " 바이트 " + files[i].getName());
					total += size;
					count++;
				} else if(files[i].isDirectory()){
					System.out.println(lmd + " <DIR> " + files[i].getName());
				}
			}
			System.out.println(count + "개 파일 " + total + " 바이트");
		}
	}
	// 문제3. C:\storage 디렉터리를 삭제하시오.
	// 파일이 저장된 디렉터리는 지워지지 않으므로 먼저 디렉터리에 저장된 파일을 삭제해야한다.
	public static void ex03() {
		
		File dir = new File("C:" + File.separator + "storage");
		File file = new File("C:" + File.separator + dir, "myfile.txt");
		if(file.exists()) {
			file.delete();
		}
		if(dir.exists()) {
			dir.delete();
		}
	}
	
	public static void main(String[] args) throws IOException {	// main 메소드를 호출하는 곳으로 예외 처리를 넘긴다.(개발자가 try-catch 하지 않겠다.)

		ex03();
		
	}

}
