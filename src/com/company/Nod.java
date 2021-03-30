package com.company;


import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import java.util.stream.Stream;

public class Nod {
    public static int Nod(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new ArithmeticException("Произошла ошибка");
        }
        if (a % b == 0) {
            return b;
        } else if (b % a == 0) {
            return a;
        } else {
            return Collections.max(Nod.get(a).stream().filter(Nod.get(b)::contains).collect(Collectors.toList()));
        }
    }


    public static int Nod(String a, String b) {
        try {
            int aint = Integer.parseInt(a.trim());
            int bint = Integer.parseInt(b.trim());
            return Nod(aint, bint);
        } catch (NumberFormatException nfe) {
            System.out.println("Произошла ошибка, повторите попытку");
        }
        return 0;
    }

    private static List<Integer> get(Integer number) {
        if (number == 0) {
            throw new ArithmeticException("Вводить нулевое значение запрещено, повторите попытку");
        }

        return Stream.iterate(1, x -> x + 1).limit(number).filter(i -> number % i == 0).collect(Collectors.toList());


    }
}






