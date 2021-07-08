package com.company;

import java.util.ArrayList;


public class MobilePhone {
    
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    
    public boolean addNewContact(Contact contact){
        
    }
    
    public boolean updateContact(Contact oldContact, Contact newContact){
        
    }
    
    public boolean findContact(String name){
        
    }
    
    public Contact queryContact(String query){
        
    }
    
    public void printContacts(){
        System.out.println("Contact List: ");
        for (int i=0 ; i < myContacts.size() ; i++){

            System.out.println((i+1) + "." + "NAME" + " -> " + "NUMBER");
        }
    }
}
