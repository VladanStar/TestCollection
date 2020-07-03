package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
      ArrayList<String> collection1 = new ArrayList<>();
      collection1.add("New York");
      collection1.add("Atlanta");
      collection1.add("Dalas");
      collection1.add("Madison");
        System.out.println("A list of cities in collection:");
        System.out.println(collection1);

        System.out.println("Is Dallas in collection1"+ collection1.contains("Dalas"));
        collection1.remove("Dallas");
        System.out.println(collection1.size() + " cities is in collection1 now");


        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("A list of cities in collection2:");
        System.out.println(collection2);

        ArrayList c1 = (ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println("Citise in collection1 or collection2 ");
        System.out.println(c1);


        c1 = (ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println("Cities in collection is");
        System.out.println(c1);

        c1 = (ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.println("Cities in collection1 but nor in collection2");
        System.out.println(c1);








    }
}
