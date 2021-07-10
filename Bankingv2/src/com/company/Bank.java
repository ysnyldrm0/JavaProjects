package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) != null) {
            return false;
        }
        else{
            branches.add(new Branch(branchName));
            return true;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        boolean flag;
        boolean flag2 = false;
        flag = findBranch(branchName) != null;
        if(flag){
            for(Customer customer : findBranch(branchName).getCustomers()){
                if(customer.getName().equalsIgnoreCase(customerName))
                    flag2 = true;
            }
            if(flag2)
                return false;
            else{
                findBranch(branchName).newCustomer(customerName,initialTransaction);
                return true;
            }
        }
        else
            return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        boolean flag;
        boolean flag2 = false;
        flag = findBranch(branchName) != null;
        if(flag){
            for(Customer customer : findBranch(branchName).getCustomers()){
                if(customer.getName().equalsIgnoreCase(customerName))
                    flag2 = true;
            }
            if(!flag2)
                return false;
            else{
                findBranch(branchName).addCustomerTransaction(customerName,transaction);
                return true;
            }
        }
        else
            return false;
    }

    // if branch exit return branch else return null;
    private Branch findBranch(String branchName){
        for(Branch branch : branches){
            if(branch.getName().equalsIgnoreCase(branchName))
                return branch;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction){
        if(findBranch(branchName) != null){
            int i = 1;
            int k = 1;
            Branch branch = findBranch(branchName);
            System.out.println("Customer details for branch " + branch.getName());
            for(Customer customer: branch.getCustomers()){
                System.out.println("Customer: " + customer.getName() + "[" + i + "]");
                i++;
                if(printTransaction){
                    System.out.println("Transactions");
                    k=1;
                    for (Double transaction: customer.getTransactions()){
                        System.out.println("[" + k + "]" + "  Amount " + transaction.doubleValue());
                        k++;
                    }
                }

            }
            return true;
        }
        return false;
    }
}
