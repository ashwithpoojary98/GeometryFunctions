package com.mathgeometry.generic;
/**
 * 
 * @author ashwith
 *
 */
public class MathDriver {
public static void main(String[] args) {
	/**
	 * Creating an object to access the methods of mathematics
	 */
	Mathmethods mathmethods=new Mathmethods();
	System.out.println(mathmethods.circle_area(5));
	System.out.println(mathmethods.circle_circuference(7));
	System.out.println(mathmethods.cube(2));
	System.out.println(mathmethods.fact(5));
	System.out.println(mathmethods.maximum(5, 7));
	System.out.println(mathmethods.minimum(5, 7));
	System.out.println(mathmethods.parallelogram(5, 7));
	System.out.println(mathmethods.rectangle_area(20, 20));
	System.out.println(mathmethods.square(8.75));
	System.out.println(mathmethods.square(5));
	System.out.println(mathmethods.square_area(5));
	System.out.println(mathmethods.squareRoot(9));
	System.out.println(mathmethods.triangle_area(10, 20));
	System.out.println(mathmethods.triangle_perimeter(10, 20, 30));
	System.out.println(mathmethods.triangle_semiperimeter(20, 10, 30));

}
}
