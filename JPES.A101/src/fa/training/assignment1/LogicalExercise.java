/*
* (C) Copyright 2021 Fresher Academy. All Rights Reversed.
*
* @author DELL
* @data Jun 29, 2021
* @version 1.0
*/
package fa.training.assignment1;

import java.util.Scanner;

public class LogicalExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int first = sc.nextInt();
		System.out.print("Input second number: ");
		int second = sc.nextInt();
		
		if (first == second)
			System.out.println(first + " == " + second);
		if (first != second)
			System.out.println(first + " != " + second);
		if (first < second)
			System.out.println(first + " < " + second);
		if (first <= second)
			System.out.println(first + " <= " + second);
		if (first > second)
			System.out.println(first + " > " + second);
		if (first >= second)
			System.out.println(first + " >= " + second);
		sc.close();
	}

}
