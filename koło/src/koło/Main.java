/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koło;

class Main {

class A{
	int x = 3;
	void meth1(){ x += 1;}
	void meth2(A a){a.x += x; }
	void meth3(){int x=3; x += x;}
}
class Zad2 {
	public static void main(String args[]) {
		A a = new A(), b = new A();
		a.meth1();// a.x = 4 b.x = 3
		a.meth2(b);// b.x = 7 a.x = 4
		b.meth3(); // 
		System.out.println(""+ a.x + " " + b.x);
	}
}
}