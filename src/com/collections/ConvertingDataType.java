package com.collections;

public class ConvertingDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1=10.7;
		String number;
		number=n1+"";//int or double to String
		
		//converting float to int
		int x;
		
		x=(int)n1;
		System.out.println(x);
		double y=x;
		System.out.println(y);
		
		//String to int
		String userNum="99";
		int userIntNum=Integer.parseInt(userNum);
		System.out.println(userIntNum+1);
	}

}
