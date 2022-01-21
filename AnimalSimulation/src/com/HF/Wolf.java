package com.HF;

public class Wolf extends Canine {
	
	@Override
	public void makeNoise() {
		System.out.println(getPicture() + "가 nosie");
	}
	@Override
	public void eat() {
		System.out.println(getPicture() + "가 eat");
	}


}
