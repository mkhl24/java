package com.mkhl24;

//Create a program that implements a simple mobile phone with the following capabilities.
//Able to store, modify, remove and query contact names.
//You will want to create a separate class for Contacts (name and phone number).


import java.util.ArrayList;

public class Contacts  {

    private ArrayList<String> contacts = new ArrayList<String>();

    public void addContactName (String name) {
        if (contacts.contains(name)) {
            System.out.println("Contact is already added.");
        } else {
            contacts.add(name);
        }
    }

    public ArrayList<String> getContacts() {
        return contacts;
    }

    public void printContactList () {
        System.out.println("You have " + contacts.size() + " positions in contact list.");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i+1) + ". " + contacts.get(i));
        }
    }

    private int findItem (String searchItem) {
        return contacts.indexOf(searchItem);
    }

    private void modifyContactName (int position, String newName) {
        contacts.set(position, newName);
        System.out.println("Contact on position " + (position+1) + " been modified.");
    }

    public void modifyContactName (String currentNme, String newName) {
        int position = findItem(currentNme);
        if (position >= 0) {
            modifyContactName(position, newName);
        } else {
            System.out.println("Contact not found in list.");
        }
    }

    private void removeContact (int position) {
        contacts.remove(position);
    }

    public void removeContact (String name) {
        int position = findItem(name);
        if (position >= 0) {
            removeContact(position);
        }
    }

    public boolean onFile (String name) {
        if (contacts.contains(name)) {
            return true;
        }
        return false;
    }

}
