package com.mathgeometry.generic;
/*
 * Implementation of all basic Mathematics Functions
 */
public class Mathmethods implements Geometry_Functions {
@Override
public double triangle_area(double base, double height) {
	return 0.5*base*height;
}
@Override
	public double triangle_area(double base, int height) {
	return 0.5*base*height;
	}
@Override
	public double triangle_area(int base, double height) {
	return 0.5*base*height;}
@Override
	public double triangle_area(int base, int height) {
	return 0.5*base*height;	}
@Override
	public  double triangle_semiperimeter(long a, long b, long c) {
		return (a+b+c)/2;
}
@Override
	public double square_area(double a) {
		return a*a;
	}
@Override
	public double parallelogram(double base, double height) {
		return base*height;
	}
@Override
	public double circle_area(double radius) {
		return (22/7)*radius*radius;
	}
@Override
	public double circle_circuference(double radius) {
		return 2*(22/7)*radius;
	}
@Override
public double squareRoot(double number) {
	double temp;
	double sr = number / 2;
	do {
		temp = sr;
		sr = (temp + (number / temp)) / 2;
	} while ((temp - sr) != 0);

	return sr;
}
@Override
	public long triangle_perimeter(long a, long b, long c) {
		return a+b+c;
	}
@Override
	public long square(long n) {
		return n*n;
	}
@Override
	public double square(double n) {
		return n*n;
	}
@Override
	public int maximum(int number1, int number2) {
		return number1>number2?number1:number2;
	}
@Override
	public int minimum(int number1, int number2) {
		return  number1<number2?number1:number2;
	}
@Override
public double rectangle_area(double width, double height) {
	return width*height;
}
@Override
	public double cube(int number) {
		return number*number*number;
	}
@Override
	public int fact(int number) {
	if(number==1)
	{
		return 1;
	}
		return number*fact(number-1);
	}
}
