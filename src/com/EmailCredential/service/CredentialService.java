package com.EmailCredential.service;

import com.EmailCredentialss.Implemenation.Employee;

public interface CredentialService {

    public  String generatePassword();
    public String generateEmailAddress(Employee employee);

    public String showCredentials(Employee employee);




}
