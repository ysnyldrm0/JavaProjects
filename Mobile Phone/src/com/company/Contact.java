package com.company;

public class Contact {

    private String name;
    private String phoneNumber;

    // Constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Function that creates new Contact
    public static Contact createContact(String name, String phoneNumber){
        Contact newContact = new Contact(name, phoneNumber);
        return newContact;
    }
}
