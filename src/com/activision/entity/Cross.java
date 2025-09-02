package com.activision.entity;


public class Cross {
	
	public static void displayCross() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.print("*");
			}
	
			System.out.println();
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
			displayCross();
			System.out.println("ici repose le guerrier");
			
			displayCross();
		
	}

}
