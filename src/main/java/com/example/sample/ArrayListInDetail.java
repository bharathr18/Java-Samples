package com.example.sample;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInDetail {
    public static void main(String[] args) {

        //Initialization of an arrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        //Add objects to the arrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        //Print the arrayList as it is
        System.out.println(arrayList);
        //Using for loop
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Data: " + arrayList.get(i));
        }
        //Using for-each loop
        for(Integer i : arrayList)
        {
            System.out.println(i);
        }

        //Get/Access an item from the specified index
        System.out.println(arrayList.get(2));

        //Change/Modify an item
        System.out.println(arrayList.set(2, 90));

        //Remove an item/object
        arrayList.remove(3);
        arrayList.add(80);

        //To clear the whole arraylist
        arrayList.clear();

        //Size of an arraylist
        arrayList.size();

        //Sort an arrayList -> util package has an inbuilt method sort() in Collections class

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(12);
        integerArrayList.add(3);
        integerArrayList.add(7);
        integerArrayList.add(1);
        integerArrayList.add(9);

        Collections.sort(integerArrayList);

        System.out.println(integerArrayList);

        //Major methods in ArrayList
//        1. arrayList.size();
//        2. arrayList.add();
//        3. arrayList.addAll();
//        4. arrayList.set(index, data);
//        5. arrayList.remove(index);
//        6. arrayList.get(index);
//        7. arrayList.isEmpty();
//        8. arrayList.contains(Object o);
//        9. arrayList.indexOf(Object o); //returns 1st occurence of 'o'
    }
}
