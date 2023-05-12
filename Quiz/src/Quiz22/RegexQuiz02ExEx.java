package Quiz22;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02ExEx {
	public static void main(String[] args) {

		String str1 = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,000원";

		String pattern1 = "\\d{6}-\\d{7}";
		String pattern2 = "GS25";
		String pattern3 = "\\([가-힣0-9]+\\)";
		String pattern4 = "[0-9,]+원"; //  \\d+,\\d+원

		List<String> list = Arrays.asList(str1,str2);

		for(String s : list) {
			Matcher m1 = Pattern.compile(pattern1).matcher(s);
			Matcher m2 = Pattern.compile(pattern2).matcher(s);
			Matcher m3 = Pattern.compile(pattern3).matcher(s);
			Matcher m4 = Pattern.compile(pattern4).matcher(s);

			if(m1.find() && m2.find() && m3.find() && m4.find()) {
				System.out.println( m1.group() );
				System.out.println( m2.group() );
				System.out.println( m3.group() );
				System.out.println( m4.group() );
				System.out.println("---------------------------------");
			}
			


		}







	}

}
