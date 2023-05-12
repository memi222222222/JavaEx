package day_02_0515;

public class hyemin {

	public static void main(String[] args) {

		// https://school.programmers.co.kr/learn/courses/30/lessons/72410
		/*
		 * new_id는 길이 1 이상 1,000 이하인 문자열입니다.
		 * new_id는 알파벳 대문자, 알파벳 소문자, 숫자, 특수문자로 구성되어 있습니다.
		 * new_id에 나타날 수 있는 특수문자는  ~ ! @ # $ % ^ & * ( ) = + [ { ] } : ? , < > / 로 한정됩니다.
		 */

		/* 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
		 * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
		 * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
		 * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
		 * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
		 * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
		 *    만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
		 * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
		 */

		String new_id = "...!@BaT#*..y.abcdefghijklm";
		//				String new_id = "z-+.^.";
		//		String new_id = "=.=";
		//				String new_id = "123_.def";
		//				String new_id = "abcdefghijklmn.p";

		new_id = new_id.toLowerCase().replaceAll("[^-_.a-z0-9]","").replaceAll("[.]{2,}",".").replaceAll("^[\\.]|[\\.]$]","");

		if(new_id.length() == 0) {
			while(new_id.length() < 3 ) {
				new_id += "a";
			}
		}
		if(new_id.length()>=15) {
			new_id = new_id.substring(0,15);
		}
		if(new_id.charAt(new_id.length()-1) == '.') {
			new_id = new_id.substring(0,new_id.length()-1);
		}
		if(new_id.length() < 3) {
			while(new_id.length() < 3) {
				new_id += new_id.charAt(new_id.length()-1);
			}
		}

		System.out.println(new_id);

	}

}
