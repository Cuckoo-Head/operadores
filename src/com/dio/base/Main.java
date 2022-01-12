package com.dio.base;

public class Main {

	public static void main(String[] args) {
		
		int a = 12;
		int b = --a;
		int c = b + a;
		int d = ++c;
		int e = d - a;
		int f = e / 2 + 2;
		int g = f % 3;
		int h = g * 5;
		int i = h;
		double exp = ++b - e + b++ % g * g;
		
		int w = 5;
		int x = w++;
		int y = --w;
		int z = 1;
		z += x;
		
		System.out.println("a = " + a + 
				", b = " + b + 
				", c = " + c +
				", d = " + d +
				", e = " + e +
				", f = " + f +
				", g = " + g +
				", h = " + h +
				", i = " + i);
		
		System.out.println(", exp = " + exp +
				", w = " + w +
				", x = " + x +
				", y = " + y +
				", z = " + z);
	}

}
