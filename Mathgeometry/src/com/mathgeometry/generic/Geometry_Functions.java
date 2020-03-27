package com.mathgeometry.generic;

public interface Geometry_Functions {
/**
 * Find the area of triangle
 * @param base
 * @param height
 * @return
 */
public  double triangle_area(double base,double height);
/**
 * Find the area of rectangle
 * @param width
 * @param height
 * @return
 */
public double rectangle_area(double width,double height);
/**
 * Find the area of square
 * @param a
 * @return
 */
public double square_area(double a);
/**
 * Find the area of parallelogram
 * @param base
 * @param height
 * @return
 */
public double parallelogram(double base,double height);
/**
 *  Find the area of circle
 * @param radius
 * @return
 */
public double circle_area(double radius);
/**
 *  Find the area of circle circumference
 * @param radius
 * @return
 */
public double circle_circuference(double radius);
/**
 *  Find the perimeter of triangle
 * @param a
 * @param b
 * @param c
 * @return
 */
public long triangle_perimeter(long a,long b,long c);
/**
 * Find the semi_perimeter of triangle
 * @param a
 * @param b
 * @param c
 * @return
 */
public double triangle_semiperimeter(long a,long b,long c);
/**
 * Find the Square root
 * @param number
 * @return
 */
public double squareRoot(double number);
/**
 * Find the Square
 * @param n
 * @return
 */
public long square(long n);
/**
 *  Find the Square
 * @param n
 * @return
 */
public double square(double n);
/**
 *  Find the cube
 * @param number
 * @return
 */
public double cube(int number);
/**
 *  Find the Maximum
 * @param number1
 * @param number2
 * @return
 */
public int maximum(int number1,int number2);
/**
 *  Find the Minimum
 * @param number1
 * @param number2
 * @return
 */
public int minimum(int number1,int number2);
/**
 *  Find the Factorial
 * @param number
 * @return
 */
public int fact(int number);
/**
 *  Find the area of triangle
 * @param base
 * @param height
 * @return
 */
public double triangle_area(int base,double height);
/**
 * Find the area of triangle
 * @param base
 * @param height
 * @return
 */
public double triangle_area(double base,int height);
/**
 * Find the area of triangle
 * @param base
 * @param height
 * @return
 */
public double triangle_area(int base,int height);	

}
