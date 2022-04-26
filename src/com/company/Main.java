package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	/*ArrayList тузунуз
1ден 100го чейинки 50 сан менен толтурунуз
Дагы 2 ArrayList тузуп бирисине так сандарды, экинчисине жуп сандарды салыныз
Аларды консольго чыгарыныз*/

        ArrayList<Integer> list1 = new ArrayList<>();
        int size = 50;
        int count = 0;
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            list1.add(random.nextInt(1, 100));
            count++;
        }
           System.out.println(list1);
        System.out.println(count);

        ArrayList <Integer> list2 = new ArrayList<>(list1);

        for (int evenNumbers : list2) {
            if (evenNumbers % 2 == 0) {
                System.out.println("Четные : " + evenNumbers);
            }
        }
        ArrayList <Integer> list3 = new ArrayList<>(list1);
        for (int oddNumbers : list1) {
            if (oddNumbers % 2 != 0) {
                System.out.println("Не четные : " + oddNumbers);
            }
        }
        }
    }
