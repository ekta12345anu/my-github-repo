package com.ekta.arrays;

public class Ex_02 {
	public static void main(String[] args) {

		int i=999;
		int num=0;
		boolean flag=false;
		while(i>99){
			int j=i;
			while(j>99){
				num=i*j;
				if(checkPal(num)==num){
					flag=true;
					break;
					
				}
				j--;
			}
			if(flag){
				break;
			}
			i--;
		}
		System.out.println(num);
	}
	
	static int checkPal(int num){
		int actual=num;
		int orig=num;
		int rev=0;
		int len=0;
		while(num/10!=0){
			len++;
			num/=10;
		}
		int i=len;
		while(actual>0  ){
			int r=actual%10;
			rev+=r*Math.pow(10, i);
			actual/=10;
			i--;
		}
		
		if(orig==rev){
			return rev;
		}
			
		return 0;
	}

}
