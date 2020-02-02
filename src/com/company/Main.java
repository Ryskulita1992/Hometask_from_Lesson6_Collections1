package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>(5);//Create a list of strings

        System.out.println("Please enter  information");

        Scanner s = new Scanner(System.in);
        listA.add(s.nextLine());
        listA.add(s.nextLine());
        listA.add(s.nextLine());
        listA.add(s.nextLine());
        listA.add(s.nextLine());
        System.out.println(listA);

        Iterator<String> iterator = listA.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList<String> listB = new ArrayList<>(5);
        System.out.println("Please enter information");
        listB.add(s.nextLine());
        listB.add(s.nextLine());
        listB.add(s.nextLine());
        listB.add(s.nextLine());
        listB.add(s.nextLine());

        iterator =listB.iterator();
        while (iterator.hasNext()) {
            System.out.println(listB.iterator().next());

        }
        ArrayList<String>listC=new ArrayList<>();
        Collections.sort(listA);
        Collections.sort(listB);
        Collections.sort(listB, Collections.reverseOrder());
        //Collections.reverse(listB);

        listC.addAll(listA);
        listC.addAll(listB);
        listC.toString().length();


        System.out.println("List after the use of" +
                " Collection.sort() :\n" + listC);
    }
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */

}











