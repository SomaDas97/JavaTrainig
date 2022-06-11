package CoreJavaTask3;
/*
 * Write a program to create a class named shape. In this class we have three
sub classes circle, triangle and square each class has two member function
named area() and perimeter(). Create these using polymorphism concepts.

 */
import java.util.*;

public class Shape {
	
	final double pi = 3.14;
	int r ;
}

class Circle extends Shape  {
	
	
	void area(double pi , int r) {
		double a=(3.14*r*r);
		System.out.println(a);
		
	}
	void perimeter(double pi , int r) {
		double a=(3.14*r*2);
		System.out.println(a);
	}
}

class Triangle extends Circle {
	
	
	void area (int b , int h) {
		System.out.println(1/2 * b* h);
	}
	void perimeter(int a , int b , int c) {
		System.out.println(a+b+c);
	}
}

class Square extends Triangle {
	void area (int a) {
		System.out.println(a*a);
	}
	void perimeter(double pi , int a) {
		System.out.println(4*a);
	}
}