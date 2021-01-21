package com.collections;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[5];
		array[0]=1;
		array[1]=1;
		array[2]=1;
		array[3]=1;
		array[4]=1;
		
		for(int value:array) {
			System.out.println(value);
		} 
		System.out.println("---------------------------------------");
		ArrayList<Integer> myarraylist=new ArrayList<Integer>();
		myarraylist.add(1);
		myarraylist.add(1);
		myarraylist.add(1);
		myarraylist.add(1);
		myarraylist.add(1);
		myarraylist.add(1);
		myarraylist.add(1);
		
		for(int alvalue: myarraylist) {
			System.out.println(alvalue);
		}
	}

}
