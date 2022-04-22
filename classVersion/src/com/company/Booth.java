package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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
        setAllEmptyBooths(allEmptyBooths);
        patientCount = patientCount + 1;
        System.out.println("Enter Patient name");
        String patient = input.next();
        System.out.println("Enter Booth number 1-6");
        int booth = input.nextInt();
        for (int i = 0; i< booths.length; i++){
            if((booths[i]==null)&&(booth == i+1)){
               booths[i]=patient;
                System.out.println(patient +  " added  " );
            }
            else {
                continue;
            }

        }

        /*if (booths[boothNumber - 1] == null) {
            booths[boothNumber - 1] = patient;
            System.out.println("A patient is added to booth " + boothNumber);
            vaccineStock = vaccineStock - 1;
            if (vaccineStock < 20) {
                System.out.println("Stock is lower than twenty");
            }
        } else {
            System.out.println("Can not add to booth " + boothNumber);
        }*/

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
        System.out.println("Remaining vacination count is " + vaccineStock);
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

    public void setWriteFile(String writeFile) {
        this.writeFile = writeFile;
        try {
            FileWriter fw = new FileWriter("vaccinationData.txt");
            fw.write("Remaining vaccination stock = " + vaccineStock);
            fw.close();
            System.out.println("Wrote data to a file ");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getReadFile() {
        return readFile;
    }

    public void setReadFile(String readFile) {
        this.readFile = readFile;
        try {
            File myObj = new File("vaccinationData.txt");
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
