package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
    public static void main(String[] args) throws IOException {
    	String str2 = "20180311-01-0079201803112 건담베이스 부천점 [RG] HACO ROOM 꼬마곰 재키 키트 1 15,500원";
    	String[] splitStr = str2.split("-|\\s+|\\[|\\]|\\s{1}\\d{1,2}\\s{1}");
    	
    	String str3 = "20180311-01-0079201803112 건담베이스 부천점 [RG] HACO ROOM 꼬마곰 재키 키트 1 15,500원";

    	// 1. 날짜 패턴 (YYYYMMDD)
    	Pattern pattern1 = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})-");
    	Matcher matcher1 = pattern1.matcher(str2);
    	if (matcher1.find()) {
    	    String date = matcher1.group(1) + "-" + matcher1.group(2) + "-" + matcher1.group(3);
    	    System.out.println(date);  // 2018-03-11
    	}

    	// 2. 일련번호 패턴 (2자리-2자리-7자리)
    	Pattern pattern2 = Pattern.compile("-([\\d-]+)\\s");
    	Matcher matcher2 = pattern2.matcher(str2);
    	if (matcher2.find()) {
    	    String serial = matcher2.group(1);
    	    System.out.println(serial);  // 01-0079-20180311
    	}

    	// 3. 매장명 패턴
    	Pattern pattern3 = Pattern.compile("\\s(\\S+)\\s\\[");
    	Matcher matcher3 = pattern3.matcher(str2);
    	if (matcher3.find()) {
    	    String store = matcher3.group(1);
    	    System.out.println(store);  // 건담베이스 부천점
    	}

    	// 4. 상품명 패턴
    	Pattern pattern4 = Pattern.compile("\\]\\s(\\S.*)\\s\\d+\\s");
    	Matcher matcher4 = pattern4.matcher(str2);
    	if (matcher4.find()) {
    	    String product = matcher4.group(1);
    	    System.out.println(product);  // HACO ROOM 꼬마곰 재키 키트
    	}

    	// 5. 가격 패턴 (숫자와 쉼표로 이루어진 금액)
    	Pattern pattern5 = Pattern.compile("\\s(\\d{1,3}(,\\d{3})*)원$");

    	
    	
}}
