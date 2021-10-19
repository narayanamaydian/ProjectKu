package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<Integer>();

        List<Integer> anotherNum = new ArrayList<Integer>();

        for(int i = 1; i<11; i++){
            number.add(i);
        }

        for(int i = 0; i<number.size(); i++){
            System.out.println(number.get(i));
        }
        System.out.println("menggunakan stream");
        // number.stream().forEach(currNum -> System.out.println(currNum));

        anotherNum = number.stream().filter(currNum -> currNum % 2 == 0).collect(Collectors.toList());

        anotherNum.stream().forEach(currNum -> System.out.println(currNum));

    }
}
