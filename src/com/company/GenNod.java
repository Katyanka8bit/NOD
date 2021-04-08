package com.company;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class GenNod {

    public static <T extends Number> Serializable GenericsNod(T a, T b) {

        int nod = 1;
        if (a.intValue() <= 0 || b.intValue() <= 0) {
            throw new ArithmeticException("Произошла ошибка");
        }
        if (a.intValue() % b.intValue() == 0) {
            return b;
        } else if (b.intValue() % a.intValue() == 0) {
            return a;
        } else {
            if (a.intValue() > b.intValue()) {
                T tmp = a;
                a = b;
                b = tmp;
            }
            for (T i : GenNod.getListSimpleDividersGen(a)) {
                if (a.intValue() % i.intValue() == 0 && b.intValue() % i.intValue() == 0) {
                    nod *= i.intValue();
                    b = (T) (Integer) (b.intValue() / i.intValue());
                }
            }
        }
        return nod;
    }

    public static <T extends Number> List<T> getListSimpleDividersGen(T number) {
        List<T> list = new ArrayList<>();
        if (number.intValue() == 0) {
            throw new ArithmeticException("Нельзя вводить нулевое значение");
        }
        for (Integer i = 2; i <= number.intValue(); i++) {
            while (number.intValue() % i == 0) {
                list.add((T) i);
                number = (T) (Integer) (number.intValue() / i.intValue());
            }
        }
        return list;
    }

}





