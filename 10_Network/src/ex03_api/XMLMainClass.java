package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;


public class XMLMainClass {

	public static void ex01() {
		
		/* 항공공항공사_항공기 운항정보 : 공항 코드 정보
		 	1. 서비스URL : http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList
		 	2. 요청변수(Request Parameter)
		 		1) serviceKey : 인증키 - 인증키 첫 글자는 소문자 여야 한다.
		 */
		
		// 인코드 키를 받았을 때 바로 덧붙여준다.
		
		// 보통 인코드 키를 제공을 잘 안하기에 디코드 키를 받으면 아래와 같이 처리한다.
		String serviceKey = "I9D5ug/pCPp10+pv7KJBemPzO/qWSj+cAAmRzKspUCjvqxTRvM3YdAUoilwDrT/7k1UU02s5WHmzhsDP/Xyp7w==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET"); 	// 요청방식 주소창에 파라미터를 붙여서 보내는 방식을 get 대문자로 작성
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8"); 		// XML의 컨텐트 타입(세미콜론을 붙이면 내용을 추가로 적을 수 있다)
			
			int responseCode = con.getResponseCode();
			
			if(responseCode == 200) {		// HttpURLConnection.HTTP_OK과 같다
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			// read(), read(char[] cbuf), readLine()
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);		// 줄바꿈이 소용이 없었다
			}
			reader.close();
			con.disconnect();
			File file = new File("C:" + File.separator + "storage", "공항코드정보.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			
			writer.close();
			System.out.println("공항코드정보.xml이 생성되었습니다.");
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void ex02() {
		
		/* 항공공항공사_항공기 운항정보 : 국제선 운항 스케줄
	 	1. 서비스URL : http://openapi.airport.co.kr/service/rest/DflightScheduleList/getDflightScheduleList
	 	2. 요청변수(Request Parameter)
	 		1) serviceKey : 인증키 - 인증키 첫 글자는 소문자 여야 한다.
	 		2) pageNo : 조회할 페이지 번호
	 		3) schDate : 검색일자
	 		4) schDeptCityCode : 출발도시코드
	 		5) schArrvCityCode : 도착도시코드
	 */
		
		String serviceKey = "I9D5ug/pCPp10+pv7KJBemPzO/qWSj+cAAmRzKspUCjvqxTRvM3YdAUoilwDrT/7k1UU02s5WHmzhsDP/Xyp7w==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList";
		
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			apiURL += "&pageNo=1";
			apiURL += "&schDate=20230201";
			apiURL += "&schDeptCityCode=ICN";
			apiURL += "&schArrvCityCode=JFK";
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET"); 	// 요청방식 주소창에 파라미터를 붙여서 보내는 방식을 get 대문자로 작성
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8;"); 		// XML의 컨텐트 타입(세미콜론을 붙이면 내용을 추가로 적을 수 있다)
			
			
			int responseCode = con.getResponseCode();
			
			if(responseCode == 200) {		// HttpURLConnection.HTTP_OK과 같다
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			// read(), read(char[] cbuf), readLine()
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);		// 줄바꿈이 소용이 없었다
			}
			reader.close();
			con.disconnect();
			System.out.println(sb.toString());
			/*File file = new File("C:" + File.separator + "storage", "국제선운항스케쥴.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			System.out.println("국제선운항스케쥴.xml이 생성되었습니다.");
		*/
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ex02();
		
		
		
	}

}
