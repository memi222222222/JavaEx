package Main;

import java.util.Scanner;

public class Main8393{
        
        public static void main(String[]args){
            
            Scanner scan = new Scanner(System.in);
            
            int n = scan.nextInt();
            
            int i = 0;
            int sum = 0;
            
            while(i <= n) {
                
                sum += i;
                i++;
            }
            System.out.println(sum);
            
    }
    
    
}