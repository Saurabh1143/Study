package com.study;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=24;
		int abc;
		boolean itsPrime = false;
		if (num!=0) {
			for (int i = 2; i < num/2; i++) {
				abc=num%2;
				if (abc==0) {
					
					itsPrime=true;
				}
				else {
					itsPrime=false;
				}
				
			}
			if (itsPrime){
				System.out.println("its Prime");
			}
			else {
				System.out.println("its not prime");
			}
			
		}

	}

}
