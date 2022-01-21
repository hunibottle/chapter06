package com.HF;

public class Dog extends Canine implements Pet{
	
	
	public void makeNoise() {
		System.out.println(getPicture() + "가 멍멍 짖습니다");
	}
	
	public void eat() {
		System.out.println(getPicture() + "가 개사료를 먹습니다.");
	}
	@Override
	public void beFriendly() {
		System.out.println("친한척하기");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void play() {
		System.out.println("놀기");
		// TODO Auto-generated method stub
		
	}


}
