package com.HF;

public class Main {

	public static void main(String[] args) {
		
		Animal arrow = new Dog();
		arrow.makeNoise();
		arrow.eat();
		arrow.setPicture("arrow");
		
		Pet pet = (Pet) arrow;
		pet.beFriendly();
		pet.play();
	}
}
