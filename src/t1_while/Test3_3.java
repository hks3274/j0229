package t1_while;

import java.util.Scanner;


//무한루프(무한 loop)
public class Test3_3 {
	public static void main(String[] args) {
		int i =0;
		boolean run =true;
		
		while(run) {
			i++;
			System.out.println(i+" ");
			//if(i == 10) break;
			if(i == 10) run = false;
		}
	}

}
