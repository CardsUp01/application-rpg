package com.activision.test;

import com.activision.entity.Guerriers;

public class TestGuerriers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Guerriers serviceGuerriers = new Guerriers();
		
		int nb = serviceGuerriers.nbGuerriers();
		
		System.out.println(nb); 
		
		serviceGuerriers.displayGuerriers();
		
	}

}

	


