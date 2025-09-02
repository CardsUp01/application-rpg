package com.activision.test;

import com.activision.entity.Archers;

public class TestArchers {
	
	public static void main(String[] args) {
		
		Archers serviceArchers = new Archers();
		
		int nb = serviceArchers.nbArchers();
		
		System.out.println(nb);
		
		serviceArchers.displayArchers();
		
	}

}