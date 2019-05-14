/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Mateusz
 */
abstract class A {
	private int x = 1;
	protected int y = 0;
	abstract void metodaA();
	void metodaB() {}
}

class B extends A {
	private int z;
	static void metodaC() {}
	void metodaA() {}
	B(int i) {
		z = i;
	}
}

class Test1 {
	public static void main(String[] args) {
		/* 1 */A a = new A(1);
		/* 2 */B b = new B(1); b.y = 1;
		/* 3 */A c = new B(1); c.metodaC();
		/* 4 */A d = new B(); ((B) d).metodaC();
		/* 5 */B e = new B(2);
		/* 6 */B.metodaC();
		/* 7 */B.metodaA();
		/* 8 */A f = new B(2); f.y = 7;
		/* 9 */B g = new B(2); g.z = 8;
		/* 10 */new B(2).metodaB();
	}
}
