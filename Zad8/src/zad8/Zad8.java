/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad8;

/**
 *
 * @author Mateusz
 */
class G {
    String a() { return "A"; }
    String b() { return a()+"B";}
    String c() { return b()+"C";}
}
class H extends G {
	String a(){ return "X";}
	String b() { return super.b()+"Y"; }
	String d() { return super.a()+"Z";}
}
public class Zad8 {
    public static void main(String[] args) {
	G g = new G() ;	H h = new H() ;
	System.out.println(g.a() + " " + g.b() + " " + g.c()); // A AB ABC
	System.out.println(h.a() + " " + h.b() + " " + h.c() // X XBY XBYC
			   + " " +h.d()); // AZ
  }
}
