package main;

public class Quiz6 {

	public static void main(String[] args) {
		
		BallPen ballpen = new BallPen(2, "100%", "파랑색");
		FountainPen fountainPen = new FountainPen(3, "80%", "몽블랑");

		System.out.println("볼펜");
		ballpen.showInfo();
		System.out.println();
		System.out.println("만년필");
		fountainPen.showInfo();
		
		
		
		
	}
	
}

class Pen {
	int penBold ;
	String percent;
	
	public Pen(int penBold, String percent) {
		super();
		this.penBold = penBold;
		this.percent = percent;
	}	
}

class BallPen extends Pen {

	String color;

	public BallPen(int penBold, String percent, String color) {
		super(penBold, percent);
		this.color = color;
	}

	public void showInfo() {
		System.out.println("펜의 굵기 : " + penBold);
		System.out.println("남은 양 : " + percent);
		System.out.println("볼펜의 색 : " + color);
	}
		
}

class FountainPen extends Pen {

	String brand ;
	
	public FountainPen(int penBold, String percent, String brand) {
		super(penBold, percent);
		this.brand = brand;
	}

	public void showInfo() {
		System.out.println("펜의 굵기 : " + penBold);
		System.out.println("남은 양 : " + percent);
		System.out.println("브랜드 : " +  brand);
	}

	
}
