/** Write a program to display stars in a triangular form--a single star in the first line, two in the second line,three stars in the thrird line and so on.**/
//Right Traingle Pattern
package com.loops;

public class StarPattern {
	public static void main(String[] args) {
		for (int rows = 1; rows <= 5; rows++) {
			for (int stars = 1; stars <= rows; stars++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
