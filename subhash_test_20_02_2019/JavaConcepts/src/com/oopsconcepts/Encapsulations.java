package com.oopsconcepts;

// encapsulation is machanisum. wrapping of variables and code acting into a single unit.
// it is a combination of data hiding and abstraction.
//main purpose is  to protect my code  from other user .
// 
//Encapsulation is done using access modifiers (public, protected, private) with classes, interfaces, setters, getters.

public class Encapsulations {
	
	private int i;
	private String name;
	
	public int getI() {
		return i;
	}

public void setI(int i) {
		this.i = i;
	}


public String getName() {
		return name;
	}

public void setName(String name) {
		this.name = name;
	}

public static void main(String[] args) {
	Encapsulations obj=new Encapsulations();
	obj.setI(200);
	System.out.println(obj.getI());
	obj.setName("subhashchandrabose");
	System.out.println(obj.getName());

	}

}
