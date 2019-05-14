/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Mateusz
 */
class Liczby {
	private int a = 15;
	static int b = 8;

	Liczby(int i) {
		a = a * i;
		b = a - b;
	}
	Liczby() {
		b = a - 1;
		a = a / b;
	}
	void wyswietl() {
		System.out.println("a = " + a + " b = " + b);
	}
	static {
		b = 2 * (b + 1);
	}
}
class Test {
	public static void main(String[] args) {
		Liczby.b++; // 
		System.out.println(Liczby.b); // b = 19 
		Liczby licz1 = new Liczby(1); // 
		licz1.wyswietl(); // a = 15 b = - 4
		Liczby licz2 = new Liczby(-1); // a = -15 b = - 11
		Liczby licz3 = new Liczby(); // b = 14 a = 15 / 14
		Liczby.b++; // b = 15 
		licz2.wyswietl(); // a = - 15 b = 15
		licz3.wyswietl(); // a = 1 b = 15
	}
}
