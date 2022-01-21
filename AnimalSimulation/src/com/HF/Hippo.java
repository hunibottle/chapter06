package com.HF;

public abstract class Hippo extends Animal {
	
	public void makeNoise() {
		System.out.println(getPicture() + "가 nosie");
	}
	
	public void eat() {
		System.out.println(getPicture() + "가 eat");
	}

}
