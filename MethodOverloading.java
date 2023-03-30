package com.study;

public class MethodOverloading {
	
	public static double func(double a,double b) {
		System.out.println("double" + (a+b));
		return (a+b);
	}
	
	public double func(int a,int b) {
	
		System.out.println("int" + (a+b));
		return (a+b);
	}


	public static void main(String[] args) {
		System.out.println(func(5,50d));
		MethodOverloading methodOverloading=new MethodOverloading();
		methodOverloading.func(5, 5);

	}

}
