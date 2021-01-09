package com.collections;

import java.util.ArrayList;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] contact = new String[5];
		contact[0] = "Sameer";
		contact[1] = "Riddhima";
		contact[2] = "Anjana";
		System.out.println("Array size " +contact.length);

//		for (int index = 0; index < 5; index++) {
//			System.out.println(contact[index]);
//		}
		ArrayList<String> mycontacts=new ArrayList<String>();
		mycontacts.add("Sameer");
		mycontacts.add("Riddhima");
		mycontacts.add("Anjana");
		mycontacts.add("Max");
		System.out.println("ArrayList size " +mycontacts.size());
		ArrayList<Integer> mynumber=new ArrayList<Integer>();
		mynumber.add(555);
		mynumber.add(666);
		mynumber.add(777);
		
		for (int index = 0; index <mycontacts.size(); index++) {
		System.out.println(mycontacts.get(index));
	}
		for(int value:mynumber) {
			System.out.println(+value);
		}
	}
}
