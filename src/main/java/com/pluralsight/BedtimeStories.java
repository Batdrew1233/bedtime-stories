package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("What story would you like to read?");
            String userPick = scanner.nextLine().toLowerCase();
            String fileName;

            if (userPick.equalsIgnoreCase("Goldilocks")){
                fileName = "goldilocks.txt";
            } else if (userPick.equalsIgnoreCase("Hansel and Gretel")) {
                fileName = "hansel_and_gretel.txt";
            } else if (userPick.equalsIgnoreCase("Mary had a little lamb")) {
                fileName = "mary_had_a_little_lamb.txt";
            }else {
                System.out.println("I dont know that story, try again.");
                return;
            }

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(Exception ex){
            System.out.println("Something went wrong!");

        }
    }
}
