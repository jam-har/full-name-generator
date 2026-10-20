package com.pluralsight;

import java.util.Scanner;


public class FullNameApplication {
    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = userEntry.nextLine();

        System.out.println("Enter your middle initial (letters only):");
        String middleInitial = userEntry.nextLine();

        System.out.println("Enter your last name:");
        String lastName = userEntry.nextLine();

        System.out.println("Enter your suffix(es):");
        String suffix = userEntry.nextLine();

        String fullName;

        if (!firstName.isBlank() && !lastName.isBlank() && !middleInitial.isBlank() && !suffix.isBlank()){
            fullName = firstName + middleInitial + lastName + suffix;
        } else if (!firstName.isBlank() && !lastName.isBlank() && middleInitial.isBlank() && !suffix.isBlank()) {
            fullName = firstName + lastName + suffix;
        } else if (!firstName.isBlank() && !lastName.isBlank() && !middleInitial.isBlank() && suffix.isBlank()) {
            fullName = firstName + middleInitial + lastName;
        } else if (!firstName.isBlank() && !lastName.isBlank() && middleInitial.isBlank() && suffix.isBlank()) {
            fullName = firstName + lastName;
        } else {
            System.out.println("Please enter your full name");
            return;
        }
        System.out.println(fullName);


    }



}
