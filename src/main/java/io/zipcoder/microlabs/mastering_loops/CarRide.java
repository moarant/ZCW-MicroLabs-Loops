package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class CarRide {

    Scanner scanner = new Scanner(System.in);

    public String areWeThereYet(){
        boolean answer= false;
        String tellInput;

        while( answer !=true){
            System.out.println("Are we there yet?");
            tellInput= scanner.nextLine();
            if (tellInput.equalsIgnoreCase("yes")) {
                System.out.println("Good!");
                break;
            }


        }



        return "Good!";
    }

}
