package main;

public class Quiz3 {

	public static void main(String[] args) {
		int sum = 0;
		int i ;
		
		for (i = 1 ; i< 100 ; i++) {
			sum += i;
			
			if(sum >= 300) {
				break;
			}
			
		}
		System.out.println("i : " + i + " , sum " + sum);
		
	}
	
}
