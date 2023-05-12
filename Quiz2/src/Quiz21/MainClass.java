package Quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		// 지역명, 규모구분, 연도, 월, 분양가격 -> 1행 x 4800개
		/*
		 *  1. 버퍼리더 이용하여 한줄씩 읽기
		 *  2. split(",",5); 사용하여 Data객체에 한줄단위로 저장하고 
		 *  3. List<Data>에 하나씩 추가한다.
		 *  
		 *  4. 람다식을 이욯해서 (지역: 서울, 4분기중 9월~ 12월 , 분양가격: 2000이상) 인 객체만 뽑아서
		 *  새로운 리스트로 반환. 
		 */
		Data dt  = new Data();
		String path = "C:\\Users\\user\\Desktop\\주택도시보증공사_전국 평균 분양가격.csv";
		List<Data> data = new ArrayList<>();
		String str ;
		int i = 0;
		try(BufferedReader br = new BufferedReader( new InputStreamReader(
				new FileInputStream(path), "EUC-KR") ); ) {

			while( (str = br.readLine()) != null) {
				String[] arr = str.split(",",5);
				arr[4] = arr[4].replace(",","").replace("\"", "");
				data.add(new Data(arr[0],arr[1],arr[2],arr[3],arr[4])) ;
				
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		List<Data> data2 
		=  data.stream().filter(a->a.getRegion().equals("서울")).filter(b-> Integer.parseInt(b.getMonth()) > 8)
		.filter(c -> Integer.parseInt(c.getPrice()) >1999).toList();
				
		for(Data a : data2) {
			System.out.println("지역:" + a.getRegion()+", 월:" + a.getMonth() + ", 가격:"+ a.getPrice());
			
			
		}
		
		
		
		
	}
}
