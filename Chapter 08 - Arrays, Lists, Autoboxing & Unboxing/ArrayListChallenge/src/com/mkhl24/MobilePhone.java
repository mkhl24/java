package com.mkhl24;

// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.


import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public static Scanner scanner = new Scanner(System.in);
    public static Contacts contacts = new Contacts();

    public int readChoice () {
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }


    public void quitList () {
        System.out.println("Quit terminated.");
    }

    public boolean addNewContact (Contact contact) {
//        contacts.addContactName(scanner.nextLine());
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

//    public void updateContact () {
//        System.out.print("Enter current list name: ");
//        String currentNme = scanner.nextLine();
//        System.out.print("Enter new list name: ");
//        String newName = scanner.nextLine();
//        contacts.modifyContactName(currentNme, newName);
//    }

    public boolean removeContact (Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }

    public void printContacts () {
        System.out.println("Contact List:");
        for(int i=0; i<this.myContacts.size();i++) {
            System.out.println((i+1) +". " + this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getNumber());
        }
    }

    private int findContact (Contact contact) {
      return this.myContacts.indexOf(contact);
    }

    private int findContact (String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return  i;
            }
        }
        return -1;
    }

    public String queryContact (Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact querryContact (String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public boolean updateContact (Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " is already in the list. Update failed.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was renamed as " + newContact);
        return true;
    }

}
