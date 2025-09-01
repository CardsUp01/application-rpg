package com.activision.test;

import com.activision.entity.Voleurs;

public class TestVoleurs {
	
	public static void main(String[] args) {
		
		Voleurs serviceVoleurs = new Voleurs();
		
		int nb = serviceVoleurs.nbVoleurs();
		
		System.out.println(nb);
		
		serviceVoleurs.displayVoleurs();
		
	}

}
