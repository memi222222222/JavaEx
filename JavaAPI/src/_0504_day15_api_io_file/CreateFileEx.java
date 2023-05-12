package _0504_day15_api_io_file;

import java.io.File;

public class CreateFileEx {

	public static void main(String[] args) {
		
		/*
		 * file클래스
		 * 외부경로에 폴더.or 단순한파일생성이나 삭제를 할수 있다.
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\20230504";
	
		
		try {
			File file = new File(path);
			
			// 생성
			if( file.exists() == false ) { // 존재하면 true.  존재하지 않으면 false
				file.mkdir();  //make directory
				System.out.println("폴더생성완료");
			} else {
				System.out.println("이미 폴더가 존재합니다.");
			}

			// 삭제
//			if(file.exists()) {
//				file.delete();
//				System.out.println("폴더삭제");
//			}
//			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
