package com.sangco.racingcar;

public class Car {
	private StringBuilder sb = new StringBuilder("-");
	
	public void goOrNot(int random) {
		if(random > 4) sb.append("-"); 
		print();
	}
	
	public void print() {
		System.out.println(sb);
	}
}
