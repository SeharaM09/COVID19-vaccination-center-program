package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VaccinationCenter {

    public static int vaccineStock = 150;
    public static int patientCount = 0;
    public static String[] booths = new String[6];
    public static Boolean exit = false;

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String customerName;
        String menu="100 or VVB: View all Vaccination Booths \n 101 or VEB: View all Empty Booths \n " +
                    "102 or APB: Add Patient to a Booth \n 103 or RPB: Remove Patient from a Booth \n " +
                    "104 or VPS: View Patients Sorted in alphabetical order (Do not use library sort routine) \n " +
                    "105 or SPD: Store Program Data into file \n " +
                    "106 or LPD: Load Program Data from file \n " +
                    "107 or VRV: View Remaining Vaccinations \n " +
                    "108 or AVS: Add Vaccinations to the Stock \n " +
                    "999 or EXT: Exit the Program";

        System.out.println(menu);
        while (!exit) {
            String menuItem = input.nextLine();

            if (menuItem.equals("100") || (menuItem.equalsIgnoreCase("VVB"))) {
                allVaccinationBooths();
            }
            else if (menuItem.equals("101") || (menuItem.equalsIgnoreCase("VEB"))) {
                allEmptyBooths();
            }
            else if (menuItem.equals("102") || (menuItem.equalsIgnoreCase("APB"))) {
                System.out.println("Enter Patient name");
                String patient = input.nextLine();
                System.out.println("Enter Booth number 1-6");
                int booth = input.nextInt();
                addPatient(patient, booth);
            }
            else if (menuItem.equals("103") || (menuItem.equalsIgnoreCase("RPB"))) {
                System.out.println("Enter Booth number 1-6");
                int booth = input.nextInt();
                removePatient(booth);
            }
            else if (menuItem.equals("104") || (menuItem.equalsIgnoreCase("VPS"))) {
                viewPatients();
            }
            else if (menuItem.equals("105") || (menuItem.equalsIgnoreCase("SPD"))) {
                writeFile();
            }
            else if (menuItem.equals("106") || (menuItem.equalsIgnoreCase("LPD"))) {
                readFile();
            }
            else if (menuItem.equals("107") || (menuItem.equalsIgnoreCase("VRV"))) {
                viewRemaining();
            }
            else if (menuItem.equals("108") || (menuItem.equalsIgnoreCase("AVS"))) {
                addVaccinations();
            }
            else if (menuItem.equals("999") || (menuItem.equalsIgnoreCase("EXT"))) {
                exit();

            }


        }

    }
    public static void allVaccinationBooths() {
        for (int i = 0; i < booths.length; i++) {
            if (booths[i] == null) {
                System.out.println("Booth" + (i + 1) + " is Empty");
            } else{
                System.out.println("patient" + booths[i] + "is in booth" + (i + 1));
            }
        }
    }
    public static void allEmptyBooths() {
        for (int i = 0; i < booths.length; i++) {
            if (booths[i] == null ) {
                System.out.println("Booth" + (i + 1) + " is Empty");
            }
        }

    }
    public static void addPatient(String patient, int boothNumber){
        patientCount = patientCount + 1;
        if (booths[boothNumber - 1] == null) {
            booths[boothNumber - 1] = patient;
            System.out.println("A patient is added to booth " + boothNumber);
            vaccineStock = vaccineStock - 1;
            if (vaccineStock < 20) {
                System.out.println("Stock is lower than twenty");
            }
        } else {
            System.out.println("Can not add to booth " + boothNumber);
        }
    }

    public static void removePatient(int boothNumber) {
        patientCount = patientCount - 1;
        if (booths[boothNumber - 1] == null && booths[boothNumber - 1].length() == 0) {
            System.out.println("Cannot Remove from booth " + boothNumber);
        } else {
            booths[boothNumber - 1] = null;
            System.out.println("A patient is removed from booth " + boothNumber);


        }
    }

    public static void viewPatients() {
        booths = Arrays.stream(booths)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);
        for(int j = 0; j<booths.length; j++){
            for(int i=j+1; i< booths.length;i++){
                if(booths[j].compareTo(booths[i])>0){
                    String temp = booths[j];
                    booths[j ] = booths[i];
                    booths[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(booths));
}

    private static void viewRemaining() {

        System.out.println("Remaining vaccination count is " + vaccineStock);
    }

    private static void addVaccinations() {

        vaccineStock = vaccineStock + 1;
        System.out.println("A vaccine is added");
    }

    private static void writeFile() throws IOException {
        booths = Arrays.stream(booths)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\IdeaProjects\\javacw\\vaccinationData.txt", false));
        for(int i = 0; i < booths.length; i++) {
            writer.write(booths[i].toString());
            writer.newLine();
        }
        writer.flush();
        System.out.println("Data Entered in to the file successfully");
    }
    private static void readFile() {
        booths = Arrays.stream(booths)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);
        try {
            File myObj = new File("C:\\Users\\HP\\IdeaProjects\\javacw\\vaccinationData.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void exit() {
        exit= true;
        System.out.println("Exit from the programme");
    }
}

