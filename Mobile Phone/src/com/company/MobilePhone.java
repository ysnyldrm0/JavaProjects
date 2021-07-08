package com.company;

import java.util.ArrayList;
import java.util.Locale;


public class MobilePhone {
    
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact) >= 0) {
            return false;
        }
        else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact) >= 0) {
            myContacts.remove(findContact(contact));
            return true;
        }
        else
            return false;
    }
    
    public boolean updateContact(Contact oldContact, Contact newContact){
        if(findContact(oldContact) >= 0){
            myContacts.set(findContact(oldContact),newContact);
            return true;
        }
        else
            return false;
    }

    private int findContact(Contact contact){
        for( Contact myContact: myContacts){
            if(myContact.getName().toLowerCase(Locale.ROOT).equals(contact.getName().toLowerCase(Locale.ROOT)))
                return myContacts.indexOf(myContact);
        }
        return -1;
    }
    
    private int findContact(String name){
        for (Contact myContact: myContacts){
            if(myContact.getName().toLowerCase(Locale.ROOT).equals(name.toLowerCase(Locale.ROOT)))
                return myContacts.indexOf(myContact);
        }
        return -1;
    }
    
    public Contact queryContact(String query){
        if(findContact(query) >= 0){
            return myContacts.get(findContact(query));
        }
        else
            return null;
    }
    
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i=0 ; i < myContacts.size() ; i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
