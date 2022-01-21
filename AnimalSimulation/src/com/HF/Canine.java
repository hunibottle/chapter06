package com.HF;

public class Canine extends Animal {
	//1.추상매소드를 오버라이딩 하려면 반드시 오버라이드 해야함
	//2. 나 자신이 abstract가 되면 됨.
	
	@Override
	public void roam() {
		System.out.println(getPicture()+"가 강아지과 동물답게 어슬렁 거립니다.");
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

}
