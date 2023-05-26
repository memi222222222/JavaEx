package day_03_0522;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class safeArea {

	public static void main(String[] args) {
		//		다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 
		//		위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
		//		https://school.programmers.co.kr/learn/courses/30/lessons/120866

		//		지뢰는 2차원 배열 board에 1로 표시되어 있고 
		//		board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
		//		지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 
		//		안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
		//		제한사항
		//		board는 n * n 배열입니다.
		//		1 ≤ n ≤ 100
		//		지뢰는 1로 표시되어 있습니다.
		//		board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.
		//		
		//		입출력 예
		//				board																											 result
		//		[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 0, 0], [0, 0, 0, 0, 0]]										16
		//		[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 1, 1, 0], [0, 0, 0, 0, 0]]										13
		//		[[1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1], [1, 1, 1, 1, 1, 1]]	0

		int answer = 0;
//		int[][] board = {{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 1, 1, 0},{0, 0, 0, 0, 0}};
		int count = 0;
		int count0 = 0;
		int count1 = 0;
		int[][] board = {{1},{0}};
		HashMap<String,String> map= new HashMap<>();
        int bLength = board.length;
		int iLength = board[0].length;
//    System.out.println(board[0].length);    
		for(int i = 0; i < board.length; i++) {
		

			for (int j = 0; j < board[i].length; j++) {
				count++;
				if(board[i][j]==1) {
					map.put(i+","+j, i+","+j);
					
					if(i > 0){
                        map.put((i-1)+","+j,(i-1)+",");}
					if(i < bLength-1){
                        map.put((i+1)+","+j,(i+1)+","+j);}
					if(j < bLength-1){
                        map.put(i+","+(j+1),i+","+(j+1));}
					if(j > 0 ){
                        map.put(i+","+(j-1),i+","+(j-1));}
					if(i > 0 && j > 0){
                        map.put((i-1)+","+(j-1),(i-1)+","+(j-1));}
					if(i < bLength-1 && j > 0 ){
                        map.put((i+1)+","+(j-1),(i+1)+","+(j-1));}
					if(i > 0 && j < iLength -1){
                        map.put((i-1)+","+(j+1),(i-1)+","+(j+1));}
					if(i < bLength-1 && j < iLength -1){
                        map.put((i+1)+","+(j+1),(i+1)+","+(j+1));}
					
					count1++;
               
				} else {
					count0 ++;
				}

			}

		}

		if (count0 == 0) { 
			answer = count0;
		} else if(count1 == 0) {  
			answer = count;
		} else {
			answer = count-map.size();
		}
		
//		(i-1","j-1 )
//		(i-1","j)
//		(i+1","j+1)
//		(i-1","j+1)
//		(i","j-1)
//		(i","j+1)
//		(i+1","j-1)
		System.out.println(count0);
		System.out.println(count1 );
		System.out.println(answer);
		//				map.put(i,j);
		//				map.put(i-1,j-1);
		//				map.put(i-1,j);
		//				map.put(i+1,j+1);
		//				map.put(i-1,j+1);
		//				map.put(i,j-1);
		//				map.put(i,j+1);
		//				map.put(i+1,j-1);

	


	}
}
