package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public static String con ="OOOOOOOO";
	public List getBrands(String color){
		List brands = new ArrayList<>();
		if(color.equals("amber")){
			brands.add("Jack Amber");
			brands.add("Red Moose");
		}else {
			brands.add("Jack Daniel");
			brands.add("Gout Stout");
		}
		
		return brands;
	}
}
