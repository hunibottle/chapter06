package com.chair;

public abstract class Shape {
	//abstract는 new 를 막기 위해 만든다.
	//new shape 라고 선언하면 추상적이기 때문에.
	public Shape() {
		super();
	}
	
	void rotate(){
		System.out.println("빙글빙글");
	}
	void playsound(){
		System.out.println("AIF 사운드");
	}

}
