package Main;

import java.util.Arrays;

public class Main222 {

	public static void main(String[] args) {
		int n = 10;
		 
        int a = 1;
        int[] answer = new int[a];
        for(int i = 1; i <= n; i++){
            int[] arr= new int[i]; 
            if(i % 2 !=0 ){
                arr[i] = i;
                 a ++;
                 
               }
            answer = arr;
        }
        
        
           System.out.println(Arrays.toString(answer));
           
    
		
		
		
	}
}
