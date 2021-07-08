package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Contact> myContactList = new ArrayList<>();
    static MobilePhone mobilePhone = new MobilePhone("05059398206");

    public static void main(String[] args) {

        String choice = "";

        while (!choice.toLowerCase(Locale.ROOT).equals("quit")){

            System.out.println("Type: ");
            System.out.println("'0' - See all menu Options");
            System.out.println("'Quit' - To terminate program");
            choice = scanner.nextLine();

            if(choice.equals("0")){
                menuPrinter();
                System.out.print("What do you want to do, please type your choice:");
                choice = scanner.nextLine();
                switch (choice){
                    case "1":
                        addNewContact();
                        break;
                    case "2":
                        updateContact();
                        break;
                    case "3":
                        removeContact();
                        break;
                    case "4":
                        queryContact();
                        break;
                    case "quit":
                        choice = "quit";
                        break;
                    case "5":
                        printContacts();
                        break;
                    default:
                        System.out.println("Undenified choice, use menu options");
                        break;
                }
            }
            else if(choice.toLowerCase(Locale.ROOT).equals("quit"))
                choice = "quit";

        }
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    public static void queryContact(){
        String name;
        Contact contact;
        System.out.println("Type contact name that you want to see number: ");
        name = scanner.nextLine();
        contact = mobilePhone.queryContact(name);
        if(contact != null)
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        else
            System.out.println("Contact does not exist in the list !");
    }

    public static void removeContact(){
        String name;
        boolean result;
        System.out.println("Type contact name that will remove: ");
        name = scanner.nextLine();
        Contact contact = new Contact(name,"");
        result = mobilePhone.removeContact(contact);
        if(result)
            System.out.println("Contact succesfully removed from directory !");
        else
            System.out.println("Contact does not exist in the list !");
    }

    private static void updateContact() {
        String oldContactName;
        String newContactName;
        String newContactPhoneNumber;
        boolean result;
        System.out.println("Type contact name that will update: ");
        oldContactName = scanner.nextLine();
        System.out.println("Type new contact name: ");
        newContactName = scanner.nextLine();
        System.out.println("Type new contact phone number: ");
        newContactPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newContactName,newContactPhoneNumber);
        Contact oldContact = Contact.createContact(oldContactName,"");
        result = mobilePhone.updateContact(oldContact,newContact);
        if(result)
            System.out.println("Contact succesfully updated at directory !");
        else
            System.out.println("Contact does not exist in the list !");


    }

    private static void addNewContact() {
        String name;
        String phoneNumber;
        boolean result;
        System.out.println("Type name: ");
        name = scanner.nextLine();
        System.out.println("Type phone number:");
        phoneNumber = scanner.nextLine();
        Contact contact = Contact.createContact(name,phoneNumber);
        result = mobilePhone.addNewContact(contact);
        if(result)
            System.out.println("Contact succesfully added to directory !");
        else
            System.out.println("Contact does exist in the list !");
    }

    private static void menuPrinter() {

        System.out.println("1 - Add New Contact");
        System.out.println("2 - Update Contact");
        System.out.println("3 - Remove Contact");
        System.out.println("4 - Query Contact");
        System.out.println("5 - Print Contacts");
        System.out.println("5 - Quit");
    }
}
