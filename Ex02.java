package week01.Day2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
                int pos_cnt=0, neg_cnt=0,  even_cnt=0 , odd_cnt=0;
                int number , i =1;
                final int MAX=5;
	  
                Scanner sc = new Scanner(System.in); 	
                while(  i  <= MAX) {
                    number = sc.nextInt();
                    if( number  >0){
                       pos_cnt = pos_cnt +1;
                       if(number % 2 ==0 ) {
                            even_cnt  = even_cnt +1;
                       }else{
                             odd_cnt = odd_cnt+1;
                       }
                    }else {
                       neg_cnt  = neg_cnt +1;
                    }          
                    i= i+1;
                } // while 끝
                System.out.println( "양수 개수 :"  +  pos_cnt    );
                System.out.println( "음수 개수 :" +   neg_cnt    );
                System.out.println( "양수중 짝수 개수:" +even_cnt );
                System.out.println( "양수중 음수 개수:" +odd_cnt  );
	}

}
