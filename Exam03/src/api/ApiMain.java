package api;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ApiMain {

	public static void main(String[] args) {
		String serviceKey = "I9D5ug/pCPp10+pv7KJBemPzO/qWSj+cAAmRzKspUCjvqxTRvM3YdAUoilwDrT/7k1UU02s5WHmzhsDP/Xyp7w==";
		String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		FileWriter writer = null;
		
		try {
			
			StringBuilder sbURL = new StringBuilder();
			sbURL.append(apiURL);
			sbURL.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sbURL.append("&type=json&searchYear=2021&siDo=1100&guGun=1125&numOfRows=10&pageNo=1");
			
			url = new URL(sbURL.toString());
			con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();
			con.disconnect();
			
			File file = new File("accident.txt");
			
			//System.out.println(sb.toString());
			String[] w = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
			Accident accident = null;
			StringBuilder result = new StringBuilder();
			List<Accident> accidentList = new ArrayList<Accident>();
			JSONArray item = new JSONObject(sb.toString()).getJSONObject("items").getJSONArray("item");
			for(int i = 0; i < item.length(); i++) {
				JSONObject obj = item.getJSONObject(i);
				accident = new Accident(obj.getString("occrrnc_dt"), obj.getString("occrrnc_day_cd"), obj.getInt("dth_dnv_cnt"), obj.getInt("injpsn_cnt"));
				accidentList.add(accident);
				result.append("발생일자 : " + obj.getString("occrrnc_dt") + " " + w[Integer.parseInt(obj.getString("occrrnc_day_cd")) -1] + ", 사망자수 ");
				result.append(obj.getInt("dth_dnv_cnt") + "명, 부상자수 " + obj.getInt("injpsn_cnt") + "명\n");
			}
			System.out.println(result.toString());
			
		    /*writer = new FileWriter(file);
			writer.write(result.toString());
			writer.close();
		  */
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
