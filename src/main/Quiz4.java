package main;

public class Quiz4 {

	public static void main(String[] args) {		
		
		int [] intArr = {2, 4, 6, 8, 10};
		showInfo(intArr);
		
		int [] intArr2 = {2, 4};
		showInfo2(intArr2);
		
	}
	public static int showInfo (int[] intArr){		
		
		int sum = 0;
		for (int num : intArr) {
			sum += num;
		}
		
		int ERROR = -999;
	
		if(intArr.length < 3) {
			System.out.println("두번째 배열의 합계 : " + ERROR);
		}else {
			System.out.println("첫번째 배열의 합계 : "+sum );
		}
		return 0;
	}
	
	public static int showInfo2 (int[] intArr2){		
		
		int sum2 = 0;
		for (int num : intArr2) {
			sum2 += num;
		}
		
		int ERROR = -999;
		
		if(intArr2.length < 3) {
			System.out.println("두번째 배열의 합계 : " + ERROR);
		}else {
			System.out.println("두번째 배열의 합계 : "+ sum2);
		}
		return 0;
		
		
	}
}
