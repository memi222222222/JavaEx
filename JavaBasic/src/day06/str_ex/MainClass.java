package day06.str_ex;

public class MainClass {
	
		public static void main(String[] args) {
		
			String str1 = "홍길동";
			String str2 = "홍길동";
			String str3	= new String("홍길동");
			
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
			
			System.out.println("-------------------------------");
			
			System.out.println(str1 == str2); 
			//같은파일에서 선언한 홍길동은 같은 객체를 참조하게 된다 
			System.out.println(str2 == str3); 
			//직접 생성명령을 내리거나 다른클래서넘어온 String 은 다른주소를 나타나게 된다
			// 문자열 동등시 비교시는 == 다신 equals() 메서드를 사용해서 비교햐아 한다.
			
			
			// null safety ( null안정성) 이 없어서 에러를 발생시킬 수 있다.
			if(str1.equals(str3)) {
				System.out.println("두문자가 같음");
			
				if (str1 != null && str1.equals(str3)){
					System.out.println("두 문자가 같음");
				}
			
			
			}
		}

}
