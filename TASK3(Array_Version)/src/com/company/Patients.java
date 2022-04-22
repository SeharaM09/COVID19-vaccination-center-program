package com.company;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class Patients {
    private int age;
    private String city;
    private int nic;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your city...");
        String cityName = input.next();
    }

    public int getNic() {
        return nic;
    }

    public void setNic(int nic) {
        this.nic = nic;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your NIC or passport number...");
        int nicNum = input.nextInt();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age...");
        int patAge = input.nextInt();
    }
}

