package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VaccinationCenter {
    static int vaccineStock = 150;
    static int patientCount = 0;
    static String[] booths = new String[6];
    static Boolean exit = false;
    static String Booth1;
    static String Booth2;
    static int BoothNum;
    static int boothNumber;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String customerName;
        String menu = "100 or VVB: View all Vaccination Booths \n 101 or VEB: View all Empty Booths \n " +
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

            if (menuItem.equals("100") || (menuItem.equalsIgnoreCase("VVB"))){
                Booth call = new Booth();
                call.setAllVaccinationBooths(Booth1);
            }
            else if (menuItem.equals("101") || (menuItem.equalsIgnoreCase("VEB"))){
                Booth call = new Booth();
                call.setAllEmptyBooths(Booth1);
            }
            else if (menuItem.equals("102") || (menuItem.equalsIgnoreCase("APB"))){
                Booth call = new Booth();
                call.setAddPatient(Booth1,BoothNum);
//
            }
            else if (menuItem.equals("103") || (menuItem.equalsIgnoreCase("RPB"))){

                Booth call = new Booth();

                call.setRemovePatient(Booth1,boothNumber);
                patientCount = patientCount - 1;
                /*if (booths[boothNumber - 1] == null && booths[boothNumber - 1].length() == 0) {
                    System.out.println("Cannot Remove from booth " + boothNumber);
                } else {
                    booths[boothNumber - 1] = null;
                    System.out.println("A patient is removed from booth " + boothNumber);


                }*/
            }
            else if (menuItem.equals("104") || (menuItem.equalsIgnoreCase("VPS"))){
                Booth call = new Booth();
                call.setViewPatients(Booth1);

                /*ArrayList<String> patients = new ArrayList();
                for (int i = 0; i < booths.length - 1; i++) {
                    if (booths[i] != null){
                        patients.add(booths[i]);
                    }
                }
                for (int i = 0; i < patients.size() - 1; i++) {
                    for (int j = i + 1; j < patients.size(); j++) {

                        if (patients.get(i).compareTo(patients.get(j)) > 0) {

                            String temp = patients.get(i);
                            patients.set(i, patients.get(j));
                            patients.set(j, temp);
                        }
                    }
                }

                System.out.println(Arrays.toString(new ArrayList[]{patients}));*/
            }
            else if (menuItem.equals("105") || (menuItem.equalsIgnoreCase("SPD"))){
                Booth call = new Booth();
                call.setWriteFile(Booth1);
                /*try {
                    FileWriter fw = new FileWriter("vaccinationData.txt");
                    fw.write("Remaining vaccination stock = " + vaccineStock);
                    fw.close();
                    System.out.println("Wrote data to a file ");
                } catch (Exception e) {
                    System.out.println(e);
                }*/
            }
            else if (menuItem.equals("106") || (menuItem.equalsIgnoreCase("LPD"))){
                Booth call = new Booth();
                call.setReadFile(Booth1);
               /* try {
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
                }*/
            }
            else if (menuItem.equals("107") || (menuItem.equalsIgnoreCase("VRV"))){
                Booth call = new Booth();
                call.setViewRemaining(Booth1);
                System.out.println("Remaining vaccination count is " + vaccineStock);
            }
            else if (menuItem.equals("108") || (menuItem.equalsIgnoreCase("AVS"))){
                Booth call = new Booth();
                call.setAddVaccinations(Booth1);
                vaccineStock = vaccineStock + 1;
                System.out.println("A vaccine is added");
            }
            else if (menuItem.equals("999") || (menuItem.equalsIgnoreCase("EXT"))){
                Booth call = new Booth();
                call.setExit(exit);
                exit= true;
                System.out.println("Exit from the programme");
            }


        }
    }
}