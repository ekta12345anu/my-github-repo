package com.ekta.arrays;

public class Ex_01 {

	
	public static void main(String[] args) {

		int[] array={1,5,2,3,4,5,6,7,8,9};
		System.out.print(returnDuplicate(array));

	}

	static int returnDuplicate(int[] array){
		int i=0;
		int count=1;
		while(i<10){
			int j=i+1;
			while(j<10){
				if(array[i]==array[j]){
					count++;
				}
				j++;
				if(count>1){
					return array[i];
				}
			}
			i++;
		}
return 0;
	}
	
}
