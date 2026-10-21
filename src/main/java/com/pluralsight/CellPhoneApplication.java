package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();

        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        System.out.print("What is the serial number? ");
        serialNumber = scan.nextInt();
        scan.nextLine();
        myPhone.setSerialNumber(serialNumber);

        System.out.print("What model is the phone? ");
        model = scan.nextLine();
        myPhone.setModel(model);

        System.out.print("Who is the carrier? ");
        carrier = scan.nextLine();
        myPhone.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        phoneNumber = scan.nextLine();
        myPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        owner = scan.nextLine();
        myPhone.setOwner(owner);

        System.out.println("\nSerial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());
    }
}