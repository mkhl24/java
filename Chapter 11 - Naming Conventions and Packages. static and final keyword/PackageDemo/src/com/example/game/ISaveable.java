package com.example.game;

// Create a simple interface (tip: name it Saveable or ISaveable)
// That interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
// The exact type of medium is not known to the interface (nor to the classes that implement it).
// The interface will just specify two methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList (parameter).

import java.util.List;

public interface ISaveable {

    void read(List<String> savedValues);
    List<String> write();

}
