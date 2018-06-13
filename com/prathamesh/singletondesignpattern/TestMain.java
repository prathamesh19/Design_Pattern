package com.prathamesh.singletondesignpattern;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Singleton");
		EagerInitialization e1=EagerInitialization.getInstance();
		System.out.println(e1);
	}

}
