/*
* (C) Copyright 2021 Fresher Academy. All Rights Reversed.
*
* @author DELL
* @data Jun 29, 2021
* @version 1.0
*/
package fa.training.assignment1;

import java.util.Scanner;

public class CircleExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Radius = ");
		double radius = sc.nextDouble();
		System.out.println("Perimeter is = " + (2 * Math.PI * radius));
		System.out.print("Area is = " + (Math.PI * radius * radius));
		sc.close();
	}

}
