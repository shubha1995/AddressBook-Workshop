package com.workshop;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Welcome To Address Book Problem");

			ContactDetails address = new ContactDetails();

			System.out.print("Enter Your First Name: ");
			address.setFirstName(sc.next());

			System.out.print("Enter Your Last Name: ");
			address.setLastName(sc.next());

			System.out.print("Enter Your City: ");
			address.setCity(sc.next());

			System.out.print("Enter Your State Name: ");
			address.setState(sc.next());

			System.out.print("Enter Your Zip Code: ");
			address.setZip(sc.nextInt());

			System.out.print("Enter Your Phone Number: ");
			address.setPhoneNumber(sc.nextLong());

			System.out.print("Enter Your Email Id: ");
			address.setEmail(sc.next());

			break;

		}
	}
}
