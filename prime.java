package com.ekta.collections;

public class prime {

	
	public static void main(String[] args) {

		if(checkPrime(31)==0){
			System.out.println("prime");
		}else{
			System.out.println("not prime");
		}

	}

	static int checkPrime(int num){
		int i=2;
		while(i<num){
			if(num%i!=0){
				i++;
			}else{
				return 1;
			}
		}
		return 0;
	}
	
}
