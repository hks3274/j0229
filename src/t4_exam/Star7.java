package t4_exam;
/*
         *
        ***  
       *****
      *******
     *********
      *******
       *****
        ***
         * 
 */

public class Star7 {
	public static void main(String[] args) {
		
		String str = " ";
		
		for (int i = 0; i < 9 ; i++) {
			for (int j = 0; j < 9-i/2; j++) {
				str += " ";
			}
			for (int j = 0; j < i+1 ; j+=2) {
				str += "*";
			}
			System.out.println(str);
			for (int j = 0; j < 9-i/2; j++) {
				str += " ";
			}
			
		}
		
		
	}
}
