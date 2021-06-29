/*
* (C) Copyright 2021 Fresher Academy. All Rights Reversed.
*
* @author DELL
* @data Jun 29, 2021
* @version 1.0
*/
package fa.training.assignment1;

import java.util.Scanner;

public class RectangleExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Width = ");
		double width = sc.nextDouble();
		System.out.print("Height = ");
		double height = sc.nextDouble();
		System.out.println("Area is " + width + " * " + height + " = " + (width * height));
		System.out.print("Perimeter is 2 * (" + width + " + " + height + ") = " + (2 * (width + height)));
		sc.close();
	}

}
