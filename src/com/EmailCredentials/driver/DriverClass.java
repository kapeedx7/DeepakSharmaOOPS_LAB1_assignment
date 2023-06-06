package com.EmailCredentials.driver;

import com.EmailCredential.service.CredentialService;
import com.EmailCredential.service.CredentialServiceImplementation;
import com.EmailCredentialss.Implemenation.Employee;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {

        CredentialService service = new CredentialServiceImplementation();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name ");
        String fname = sc.nextLine();
        System.out.println("Enter last name ");
        String lname = sc.nextLine();


        Employee employee = new Employee(fname,lname);

        System.out.println("Please enter the Department as following ");
        System.out.println("1. Technical ");
        System.out.println("2. Admin ");
        System.out.println("3. Human Resource ");
        System.out.println("4. Legal ");

        int option = sc.nextInt();

        switch (option){
            case 1: employee.setDepartment("tech");
                    break;
            case 2:employee.setDepartment("admin");
                    break;
            case 3:employee.setDepartment("hr");
                    break;
            case 4:employee.setDepartment("legal");
                    break;
            default:
                System.out.println("Please enter a valid option");
                break;
        }

        if(employee.getDepartment()!=null){
            employee.getDepartment();

            String emailadd = service.generateEmailAddress(employee);
            employee.setEmail(emailadd);

            String passWord = service.generatePassword();
            employee.setPassword(passWord);

            service.showCredentials(employee);
        }




    }
}
