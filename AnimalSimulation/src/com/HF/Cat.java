package com.HF;

public class Cat extends Feline {
	
	public void makeNoise() {
		System.out.println(getPicture() + "가 nosie");
	}
	
	public void eat() {
		System.out.println(getPicture() + "가 eat");
	}
	//만약 eat() 안에 파라미터를 넣으면 오버라이딩이 아니라 오버로딩이 된다.
	//-> Animal에 파라미터가 없었을때 !

}
