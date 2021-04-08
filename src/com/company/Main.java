package com.company;



public class Main {
    public static void main(String[] args) {
        System.out.println(Nod2.NodPrimeFactors(6, 8));


        try {
            int count = 0;
            for (int i = 2; i <= 100; i++) {
                for (int j = 2; j <= 100; j++) {
                    if (i != j) {
                        if (!(Nod.Nod(i, j) == (Nod2.NodPrimeFactors(i, j)))) {

                            System.out.println("Вычисленно первым методом от чисел : " + i + " и " + j + " = " + Nod.Nod(i, j));
                            System.out.println("Вычисленно вторым методом от чисел : " + i + " и " + j + " = " + Nod2.NodPrimeFactors(i, j));
                            System.out.println("Где-то ошибка");
                            count++;
                        }
                    }
                }
            }

            System.out.println("Кол-во ошибок вычисления : " + count);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }

}