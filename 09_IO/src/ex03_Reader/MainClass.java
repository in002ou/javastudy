package ex03_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

	/*
 		Reader
 		1. 문자 기반의 입력 스트림
 		2. Reader로 끝나는 이름의 클래스는 모두 문자 기반의 입력 스트림이다.
 		3. 문자를 읽어 들이는 스트림이다.(파일의 내용를 읽는다, 서버가 보낸 내용를 읽는다.)
	 */
	
	public static void ex01() {
		
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex01.txt");
		
		FileReader fr = null;
		try {
			
			fr = new FileReader(file);
			
			int c;	// 1글자를 저장할 변수
			
			while(true) {
				c = fr.read();
				
				if(c == -1) {
					break;
				}
				System.out.print((char)c);
			}
			/*
			c = fr.read();	//I
			c = fr.read();	//
			c = fr.read();	// a
			c = fr.read();	// m
			c = fr.read();	//
			c = fr.read();	//a
			c = fr.read();	//
			c = fr.read();	//b
			c = fr.read();	//o
			c = fr.read();	//y
			c = fr.read();	//.
			c = fr.read(); 	// int변환 시 -1표시된다.
			*/
		} catch(IOException e) {			//	FileNotFoundException의 부모가 IOException 이므로 같이 처리된다.
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void ex02() {

		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "ex01.txt");
		
		FileReader fr = null;
		try {
			
			fr = new FileReader(file);
			int c;	
			StringBuilder sb = new StringBuilder();
			while((c = fr.read()) != -1) {
				sb.append((char)c);
			}
			System.out.println(sb.toString());
		} catch(IOException e) {			//	FileNotFoundException의 부모가 IOException 이므로 같이 처리된다.
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void ex03() {
		
		File dir = new File("C:" +File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "ex02.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			char[] cbuf = new char[5];			// 5글자를 읽어 들이는 배열
			int readCount = 0;					// 실제로 읽은 글자의 개수
			StringBuilder sb = new StringBuilder();
			while((readCount = fr.read(cbuf)) != -1 ) {
				// ex02.txt 읽는 과정
				//		readCount 	cbuf
				// 1	5			a b c d e
				// 2	2			f g c d e	이므로 for문에 readCount 대신 cbuf.length가 들어갔다면 f g c d e가 출력.
				// 3   -1 (읽어 온 것이 없다면 -1)
					// readCount : 읽은 글자의 개수
//				for(int i = 0; i < readCount; i++) {
//					System.out.print(cbuf[i]);
//				}
				sb.append(cbuf, 0, readCount);	// 인덱스 0부터 readCount개 글자를 sb에 추가
			}	// while문 표시
			System.out.println(sb.toString());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {					// 반드시 실행하는 문
			try {
				if(fr != null) {
					fr.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void ex04() {
		/*
		 	BufferedReader의 장점
		 	1. 속도가 빠르다.
		 	2. readLine 메소드를 사용할 수 있다.
		 */
		File dir = new File("C:" + File.separator + "storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "ex03.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = null;
//			line = br.readLine();
//			line = br.readLine();		더 읽을 것이 없으면 null

			StringBuilder sb = new StringBuilder();
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ex04();

	}

}
