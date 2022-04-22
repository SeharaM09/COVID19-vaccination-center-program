package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Booth {

    private String allVaccinationBooths;
    private String allEmptyBooths;
    private String addPatient;
    private String removePatient;
    private String viewPatients;
    private String viewRemaining;
    private String addVaccinations;
    private String writeFile;
    private String readFile;
    private Boolean exit = false;
    static Scanner input = new Scanner(System.in);

    public static String[] booths = new String[6];
    public static int patientCount = 0;
    public static int vaccineStock = 150;
    // public static  exit = false;

    public String getAllVaccinationBooths() {
        return allVaccinationBooths;
    }

    public void setAllVaccinationBooths(String allVaccinationBooths) {
        this.allVaccinationBooths = allVaccinationBooths;
        for (int i = 0; i < booths.length; i++) {
            if (booths[i] == null) {
                System.out.println("Booth" + (i + 1) + " is Empty");
            } else {
                System.out.println("patient" + booths[i] + "is in booth" + (i + 1));
            }
        }
    }

    public String getAllEmptyBooths() {
        return allEmptyBooths;
    }

    public void setAllEmptyBooths(String allEmptyBooths) {
        this.allEmptyBooths = allEmptyBooths;
        for (int i = 0; i < booths.length; i++) {
            if (booths[i] == null ) {
                System.out.println("Booth" + (i + 1) + " is Empty");
            }
        }


    }

    public String getAddPatient() {
        return addPatient;
    }

    public void setAddPatient(String addPatient, int boothNumber) {
        this.addPatient = addPatient;
        System.out.println( "1: AstraZeneca");
        System.out.println( "2: Sinopharm");
        System.out.println("3: Pfizer");
        System.out.println("Enter 1, 2, 3...");
        int inject = input.nextInt();
        if (inject == 1){
            if(booths[0]==null){
                System.out.println("Enter Patient First Name");
                String patientOne = input.next();
                System.out.println("Enter Patient Surname");
                String patientTwo = input.next();
                Patient enter = new Patient();
                enter.setAge(3);
                enter.setNic(2);
                enter.setCity("Matara");
                System.out.println("Enter Booth number 1-6");
                int booth = input.nextInt();
                String patients= patientOne +' '+ patientTwo;
                for (int i = 0; i< booths.length; i++){
                    if((booths[i]==null)&&(booth == i+1)){
                        booths[i]=patients;
                        System.out.println(patients +  " added  " );
                    }
                    else {
                        continue;
                    }

                }
            }
            else if (booths[1]==null){
                System.out.println("Enter Patient First Name");
                String patientOne = input.next();
                System.out.println("Enter Patient Surname");
                String patientTwo = input.next();
                Patient enter = new Patient();
                enter.setAge(3);
                enter.setNic(2);
                enter.setCity("Matara");
                System.out.println("Enter Booth number 1-6");
                int booth = input.nextInt();
                String patients= patientOne + patientTwo;
                for (int i = 0; i< booths.length; i++){
                    if((booths[i]==null)&&(booth == i+1)){
                        booths[i]=patients;
                        System.out.println(patients +  " added  " );
                    }
                    else {
                        continue;
                    }

                }

            }

        }
        else if(inject == 2){
            if(booths[2]==null){
                System.out.println("Enter Patient First Name");
                String patientOne = input.next();
                System.out.println("Enter Patient Surname");
                String patientTwo = input.next();
                Patient enter = new Patient();
                enter.setAge(3);
                enter.setNic(2);
                enter.setCity("Matara");
                System.out.println("Enter Booth number 1-6");
                int booth = input.nextInt();
                String patients= patientOne + patientTwo;
                for (int i = 0; i< booths.length; i++){
                    if((booths[i]==null)&&(booth == i+1)){
                        booths[i]=patients;
                        System.out.println(patients +  " added  " );
                    }
                    else {
                        continue;
                    }
                }
            }
            else if (booths[3]==null){
                System.out.println("Enter Patient First Name");
                String patientOne = input.next();
                System.out.println("Enter Patient Surname");
                String patientTwo = input.next();
                Patient enter = new Patient();
                enter.setAge(3);
                enter.setNic(2);
                enter.setCity("Matara");
                System.out.println("Enter Booth number 1-6");
                int booth = input.nextInt();
                String patients= patientOne + patientTwo;
                for (int i = 0; i< booths.length; i++){
                    if((booths[i]==null)&&(booth == i+1)){
                        booths[i]=patients;
                        System.out.println(patients +  " added  " );
                    }
                    else {
                        continue;
                    }

                }

            }
        }
        else if (inject == 3){
            if(booths[4]==null){
                System.out.println("Enter Patient First Name");
                String patientOne = input.next();
                System.out.println("Enter Patient Surname");
                String patientTwo = input.next();
                Patient enter = new Patient();
                enter.setAge(3);
                enter.setNic(2);
                enter.setCity("Matara");
                System.out.println("Enter Booth number 1-6");
                int booth = input.nextInt();
                String patients= patientOne + patientTwo;
                for (int i = 0; i< booths.length; i++){
                    if((booths[i]==null)&&(booth == i+1)){
                        booths[i]=patients;
                        System.out.println(patients +  " added  " );
                    }
                    else {
                        continue;
                    }

                }
            }
            else if (booths[5]==null){
                System.out.println("Enter Patient First Name");
                String patientOne = input.next();
                System.out.println("Enter Patient Surname");
                String patientTwo = input.next();
                Patient enter = new Patient();
                enter.setAge(3);
                enter.setNic(2);
                enter.setCity("Matara");
                System.out.println("Enter Booth number 1-6");
                int booth = input.nextInt();
                String patients= patientOne + patientTwo;
                for (int i = 0; i< booths.length; i++){
                    if((booths[i]==null)&&(booth == i+1)){
                        booths[i]=patients;
                        System.out.println(patients +  " added  " );
                    }
                    else {
                        continue;
                    }

                }

            }

        }

        }




    public String getRemovePatient() {
        return removePatient;
    }
    public void setRemovePatient(String removePatient,int boothNumber) {
        this.removePatient = removePatient;
        patientCount = patientCount - 1;
        System.out.println("Select a booth number for remove");

        for (int i=0; i< 6; i++) {
            int j = 1;

            if (booths[i] != null) {

                System.out.println("booth" + (i+j));
            }

        }
        int remove = input.nextInt();
        //System.out.println("all booth are empty");

        for (int j=0; j< booths.length; j++){
            if ((booths[j] != null)&&(remove==(j+1))){
                System.out.println(booths[j] + " removed");
                booths[j] = null;
            }


        }
    }
    public String getViewPatients() {
        return viewPatients;
    }

    public void setViewPatients(String viewPatients) {
        this.viewPatients = viewPatients;
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

    public String getViewRemaining() {
        return viewRemaining;
    }

    public void setViewRemaining(String viewRemaining) {
        this.viewRemaining = viewRemaining;
        System.out.println("Remaining vaccination count is " + vaccineStock);
    }

    public String getAddVaccinations() {
        return allEmptyBooths;
    }

    public void setAddVaccinations(String addVaccinations) {
        this.addVaccinations = addVaccinations;
        vaccineStock = vaccineStock + 1;
        System.out.println("A vaccine is added");
    }

    public String getWriteFile() {
        return writeFile;
    }

    public void setWriteFile(String writeFile) throws IOException {
        this.writeFile = writeFile;
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

    public String getReadFile() {
        return readFile;
    }

    public void setReadFile(String readFile) {
        this.readFile = readFile;
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
    public Boolean getExit() {
        return exit;
    }
    public void setExit(Boolean exit) {
        this.exit = exit;
        exit= true;
        System.out.println("Exit from the programme");
    }
}
