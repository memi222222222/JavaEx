package Quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;


public class MainClass2 {
	// 지역명, 규모구분, 연도, 월, 분양가격 -> 1행 x 4800개
	/*
	 *  1. 버퍼리더 이용하여 한줄씩 읽기
	 *  2. split(",",5); 사용하여 Data객체에 한줄단위로 저장하고 
	 *  3. List<Data>에 하나씩 추가한다.
	 *  
	 *  4. 람다식을 이욯해서 (지역: 서울, 4분기중 9월~ 12월 , 분양가격: 2000이상) 인 객체만 뽑아서
	 *  새로운 리스트로 반환. 
	 */
	public static void main(String[] args) {

		List<Data> list = new ArrayList<>();
		String path = "C:\\Users\\user\\Desktop\\주택도시보증공사_전국 평균 분양가격.csv";

		try(BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream(path),"EUC-KR"))){
			br.readLine(); // (제목행) 한번 넘어감
			String str;
			while ( (str= br.readLine()) != null) {

				String[] arr = str.split(",", 5);
				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				String price = arr[4].replace(" ", "").replace(",", "").replace("\"", "").replace("-","");
				price = price.equals("") ? "0" : price;

				Data data = new Data(region, size, year, month, price);
				list.add(data); 
			}
			
			// 4번 슉 ㅈ ㅔ !!
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}




	}


}
