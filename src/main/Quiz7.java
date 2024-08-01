package main;

import java.util.ArrayList;

public class Quiz7 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<>();
		
		list.add(new Human());
		list.add(new Tiger());
		
		for (Animal ani : list) {
			Animal animal = ani;
			
			if (ani instanceof Human) {
				Human h = (Human)animal;
				h.sleep();
				h.move();
				h.read();
				System.out.println();
			}
			
			if (ani instanceof Tiger) {
				Tiger t = (Tiger)animal;
				t.sleep();
				t.move();
				t.hunting();
			}
		}
		
		
	}
	
}

class Animal {
	
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}
	
	public void move() {
		System.out.println("움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}		
	
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {

	@Override
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	
}
