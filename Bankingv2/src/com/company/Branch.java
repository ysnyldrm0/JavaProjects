package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        if(findCustomer(customerName) != null){
            return false;
        }
        else{
            Customer customer = new Customer(customerName, initialTransaction);
            customers.add(customer);
            return true;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        if(findCustomer(customerName) != null){
            findCustomer(customerName).addTransaction(transaction);
            return true;
        }else{
            return false;
        }
    }

    // if customer exist return customer else return null;
    private Customer findCustomer(String customerName){
        for(Customer customer : customers){
            if(customer.getName().equalsIgnoreCase(customerName))
                return customer;
        }
        return null;
    }


}
