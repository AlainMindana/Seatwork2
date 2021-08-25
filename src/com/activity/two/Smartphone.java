package com.activity.two;

import java.util.HashMap;
import java.util.Map;

public class Smartphone extends Telephone{
    private String phoneNo;
    private String operatingSystem;
    Map<String, String> contacts = new HashMap<>();

    public Smartphone(String phoneNo, String operatingSystem) {
        this.phoneNo = phoneNo;
        this.operatingSystem = operatingSystem;
        this.contacts = contacts;
        System.out.println(this.phoneNo + " " + this.operatingSystem + " has been added!");
    }

    public void addContact (String name, String phoneNo){
        contacts.put(name, phoneNo);
        System.out.println(name + " " + phoneNo + " has been added!");
    }

    public void removeContact(String name){
        this.contacts.remove(name);
    }

    @Override
    public void call(String phoneNo) {
        if (phoneNo.equals(this.phoneNo)){
            System.out.println("You cannot call yourself");
        }
        else {
            super.call(phoneNo);
        }
    }

    public void call(String name, String phoneNo){
        boolean exists = this.contacts.get(name) != null ? true : false;

        if (exists){
            System.out.println("Calling from contacts");
            this.call(phoneNo);
        }
        else
            System.out.println("Number " + phoneNo + " does not exist!");
    }

    public void displayContacts(){
        this.contacts.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println(this.contacts.toString());
//        System.out.println(this.contacts.values());
    }

    @Override
    public String toString() {
        return this.contacts.toString();
    }
}