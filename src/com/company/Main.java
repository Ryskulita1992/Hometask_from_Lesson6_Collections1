package com.company;

import java.awt.*;
import java.util.*;
import java.util.List;

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

        iterator = listB.iterator();
        while (iterator.hasNext()) {
            System.out.println(listB.iterator().next());

        }


        ArrayList<String> listC = new ArrayList<>(10);
        listA.add(0, "");
        listB.add(4,"");
        listA.add(1,"");
        listB.add(3,"");
        listA.add(2,"");
        listB.add(2,"");
        listA.add(3,"");
        listA.add(1,"");
        listA.add(4,"");
        listA.add(0,"");


        System.out.println("List after adding listA + listB" +
                " \n" + listC);

        System.out.println(" The process is finished because i could not make it better \uD83D\uDE0Af");


        //Collections.sort(listB, Collections.reverseOrder());
        //Collections.reverse(listB);
        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
    }}















