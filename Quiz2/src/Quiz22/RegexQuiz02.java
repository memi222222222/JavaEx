package Quiz22;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		String str1 = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,000원";
		
		
		String pattern1 = "[0-9-]{6,7}+";
		String pattern2 = "[A-Z]+[0-9]{2}";
		String pattern3 = "\\(+[가-힣]+\\)";
		String pattern4 = "[0-9,]+원";
		List<String> list = Arrays.asList(str1, str2);
		
//		Matcher m1 = Pattern.compile(pattern1).matcher(str);
//		Matcher m2 = Pattern.compile(pattern2).matcher(str);
//		Matcher m3 = Pattern.compile(pattern3).matcher(str);
//		Matcher m4 = Pattern.compile(pattern4).matcher(str);
//		
//		Matcher p1 = Pattern.compile(pattern1).matcher(str2);
//		Matcher p2 = Pattern.compile(pattern2).matcher(str2);
//		Matcher p3 = Pattern.compile(pattern3).matcher(str2);
//		Matcher p4 = Pattern.compile(pattern4).matcher(str2);
//		for(int i =0; i < list.size(); i++) {
//
//			str = list.get(i);
//			str2 = list.get(i);
//			// 패턴생성
//			// Pattern x = Pattern.compile(pattern1);
//			// Matcher y= x.matcher(str);
//
//			Matcher x = Pattern.compile(pattern1).matcher(str); // 1번째 패턴
//			Matcher y = Pattern.compile(pattern2).matcher(str); // 2번째 패턴
//
//			if( x.find()&& y.find() )	{
//				System.out.println( x.group() );
//				System.out.println( y.group() );			
//			}
//
//
//		}
		
		
	 for(int i = 0; i <list.size(); i++) {
		 str1= list.get(i);
		 str2= list.get(i);
		 Matcher x = Pattern.compile(pattern1).matcher(str1); 
		 Matcher y = Pattern.compile(pattern2).matcher(str1); 
		 Matcher q = Pattern.compile(pattern3).matcher(str1); 
		 Matcher w = Pattern.compile(pattern4).matcher(str1); 
		 Matcher x2 = Pattern.compile(pattern1).matcher(str2); 
		 Matcher y2 = Pattern.compile(pattern2).matcher(str2); 
		 Matcher q2 = Pattern.compile(pattern3).matcher(str2); 
		 Matcher w2 = Pattern.compile(pattern4).matcher(str2); 
		 if ( x.find()&& y.find()&& q.find()&& w.find()) {
			 System.out.println( x.group() );
			 System.out.println( y.group() );	
			 System.out.println( q.group() );	
			 System.out.println( w.group() );
			 System.out.println("----------------------");
			 System.out.println( x2.group() );
			 System.out.println( y2.group() );	
			 System.out.println( q2.group() );	
			 System.out.println( w2.group() );	
			 
		 }
			
		 
	 }
		
		
		
		
		
		
		
		
	}
}
