package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String response = "";
        ArrayList<Person> info = new ArrayList<>();

        do {
            System.out.println("What is person's name?");
            String name = in.nextLine();
            System.out.println("Does this person like French fries (true or false)");
            Boolean answer = in.nextBoolean();
            System.out.println("Does this person like sleeping?(true or false)");
            Boolean answer2 = in.nextBoolean();
            System.out.println("Is this person adventurous?(true or false)");
            Boolean answer3 = in.nextBoolean();
            info.add(new Person(name,answer,answer2, answer3));

            System.out.println("Would you like to enter again, enter Yes to continue or No to quit");
            response = in.next();
            in.nextLine();

        } while(!response.equalsIgnoreCase("no"));

        for (Person g:info) {
            System.out.println("Name: " + g.getName());
            System.out.println("Likes French fries: " + g.getFrenchFries());
            System.out.println("Likes sleeping: " + g.getSleeping());
            System.out.println("Is adventurous: " + g.getAdventurous());
        }

        for (Person g:info) {
            if (g.getFrenchFries() == true) ;
            System.out.println(g.getName());
        }
    }
}
