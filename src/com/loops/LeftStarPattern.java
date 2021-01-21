package com.loops;

public class LeftStarPattern  
{    
public static void main(String args[])   
{
	for(int rows=1;rows<=5;rows++) {
		for(int space=4;space>=rows;space--) {
			System.out.print(" ");			
		}
		for(int star=1;star<=rows;star++) {
			System.out.print("*");			
		}
		System.out.println();
	}
}
}