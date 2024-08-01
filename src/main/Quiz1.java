package main;

public class Quiz1 {

	public static void main(String[] args) {
		
		int math = 90;
		int eng = 70;
		int korean = 100;
		int total;
		double avg;
		
		total = math + eng + korean;
		avg =  (math + eng + korean) / 3.0;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		
	}
	
}
