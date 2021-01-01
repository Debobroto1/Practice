package com.Day1;

public class ContactDetails {

	public static void main(String[] args) {
		Name myName = new Name();
		myName.setfName("Debobroto");
		myName.setlName("Sen");


		Address myAdd = new Address();
		myAdd.flatno = 20;
		myAdd.streetName = "Alopi";
		myAdd.pinCode = "8700";
		myAdd.city = "Ranchi";
		myAdd.country = "IN";

		System.out.println(myName.getfName());
		System.out.println(myName.getlName());
	}

}
