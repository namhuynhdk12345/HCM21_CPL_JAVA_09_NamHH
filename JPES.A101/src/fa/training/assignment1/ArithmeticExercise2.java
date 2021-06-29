/*
* (C) Copyright 2021 Fresher Academy. All Rights Reversed.
*
* @author DELL
* @data Jun 29, 2021
* @version 1.0
*/
package fa.training.assignment1;

import java.util.Scanner;

public class ArithmeticExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int first = sc.nextInt();
		System.out.print("Input second number: ");
		int second = sc.nextInt();
		System.out.println(first + " + " + second + " = " + (first + second));
		System.out.println(first + " - " + second + " = " + (first - second));
		System.out.println(first + " * " + second + " = " + (first * second));
		System.out.println(first + " / " + second + " = " + (first / second));
		System.out.print(first + " % " + second + " = " + (first % second));
		sc.close();
	}

}
