package com.company;

import java.util.*;

public class Nod2 {

    public static int NodPrimeFactors(int a, int b) {
        int nod = 1;
        if (a <= 0 || b <= 0) {
            throw new ArithmeticException("Произошла ошибка");
        }
        if (a % b == 0) {
            return b;
        } else if (b % a == 0) {
            return a;
        } else {
            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp;
            }
            for (Integer i : Nod2.getListSimpleDividers(a)) {
                if (a % i == 0 && b % i == 0) {
                    nod *= i;
                    b /= i;
                }
            }
        }
        return nod;
    }

    public static List<Integer> getListSimpleDividers(Integer number) {
        List<Integer> list = new ArrayList<>();
        if (number == 0) {
            throw new ArithmeticException("Нельзя вводить нулевое значение");
        }
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                list.add(i);
                number = number / i;
            }
        }
        return list;
    }

    public static int NodPrimeFactors(String a, String b) {
        try {
            int aint = Integer.parseInt(a.trim());
            int bint = Integer.parseInt(b.trim());
            return NodPrimeFactors(aint, bint);
        } catch (NumberFormatException nfe) {
            System.out.println("Произошла ошибка, повторите попытку");
        }
        return 0;
    }

}

