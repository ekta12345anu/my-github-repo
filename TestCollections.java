package com.ekta.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollections {

	public static void main(String[] args) {

		
		List<Laptop> laptops = new ArrayList<>();
		laptops.add(new Laptop(1000, "Dell", 8));
		laptops.add(new Laptop(800, "Acer", 16));
		laptops.add(new Laptop(25000, "Apple", 64));
	//	laptops.add(new Employee("Acer", 16,900));
		
		
		Collections.sort(laptops);
		
		for(Laptop laps: laptops){
			System.out.println(laps.getPrice() + "  " +  laps.getRam());
			
		}
		
		Comparator comp= new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice()>o2.getPrice()){
					return 12;
				}
					
				else if(o1.getPrice()==o2.getPrice()){
					if(o1.getRam()>o2.getRam()){
						return 100;
					}else if(o1.getRam()==o2.getRam()){
						return 0;
					}else{
						return -200;
					}
					
				}
					

				else
					return -90;
			}
		};
		
		Collections.sort(laptops, comp);
		
		for(Laptop laps: laptops){
			System.out.println(laps.getPrice()+ "  " +  laps.getRam());
		}

	}

}
