package com.mkhl24;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java","a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Phyton","an interpeteted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol","an algorithmic language");
        System.out.println(languages.put("BASIC","Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp","lisp description")); // returns previous value

//        System.out.println(languages.get("Java"));

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println(languages.put("Java","this course about Java"));
//        System.out.println(languages.get("Java"));

        System.out.println("====================");

//        languages.remove("Lisp");

//        if(languages.remove("Algol", "a family of algorithmical languages")) {
        if(languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp","this will not work", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp not replaced");
        }

//        System.out.println(languages.replace("Scala","this will not be added"));

        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
