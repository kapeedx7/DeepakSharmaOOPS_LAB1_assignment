package com.EmailCredential.service;



import com.EmailCredentialss.Implemenation.Employee;

import java.util.Random;

public class CredentialServiceImplementation implements CredentialService{
    public static final int PASSWORD_LENGTH = 8;
    public static final String COMPANY_DOMAIN = ".gl.com";
    public String generatePassword() {

        String capitalCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = capitalCase.toLowerCase();
        String digits = "0123456789";
        String splCase = "!@#$%^&*~";

        String finalCase = capitalCase+lowerCase+digits+splCase;
        String pass = "";

        Random random = new Random();

        for(int i=0;i<PASSWORD_LENGTH;i++){
            pass = pass +finalCase.charAt(random.nextInt(finalCase.length()));
        }

        return pass;
    }

    public String generateEmailAddress(Employee employee) {
        String firstName = employee.getFirstName().toLowerCase();
        String lastName = employee.getLastName().toLowerCase();
        String department = employee.getDepartment();

        return firstName+lastName+"@"+department+COMPANY_DOMAIN;
    }

    public String showCredentials(Employee employee) {
        System.out.println("Dear "+employee.getFirstName()+" your generated credentials is as follows");
        System.out.println("Email --------> "+employee.getEmail());
        System.out.println("Password ----------> "+employee.getPassword());


        return null;
    }
}
