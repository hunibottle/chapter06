package com.kosa;

public class Dog {
	
    String name;
    
    public static void main(String[] args) {
    	
    	Dog dog1 = new Dog();
    	dog1.name ="Bart";
    	dog1.bark();
    	
    	Dog[] myDogs = new Dog[3];
    	myDogs[0] = new Dog(); 
    	myDogs[1] = new Dog();
    	myDogs[2] = dog1;
    	
    	myDogs[0].name = "Fred";
    	myDogs[1].name = "Marge";
    	System.out.println(myDogs[2].name);
    	
    	int x = 0;
    	for(int i = 0 ; i < myDogs.length ; i++) {
    		myDogs[i].bark();
    	}
    } 
    
    public void bark() {
		System.out.println(name + " says Ruff!");
	}
}
