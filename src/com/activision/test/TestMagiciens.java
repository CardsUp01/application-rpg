package com.activision.test;

import com.activision.entity.Magiciens;

public class TestMagiciens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Magiciens serviceMagiciens = new Magiciens();
		
		int nb = serviceMagiciens.nbMagiciens();
		
		System.out.println(nb);
		
		serviceMagiciens.displayMagiciens();

	}

}