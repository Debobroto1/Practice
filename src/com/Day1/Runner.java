package com.Day1;

public class Runner {

	public static void main(String[] args) {
		Address babiAdd = new Address();
		babiAdd.flatno = 20;
		babiAdd.streetName = "Cox";
		babiAdd.city = "Arizona";
		babiAdd.country = "USA";

		Address bittuAdd = babiAdd;

		System.out.println(bittuAdd.flatno);
		System.out.println(":::::::::::::::::::::::::::::");
		bittuAdd.city = "Bangalore";
		System.out.println(babiAdd.city);
	}
}
