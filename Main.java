package com.AMOLab1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Завдання №1
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double d;
            System.out.println("--------------------------------------------------");
            System.out.println("Лабораторна робота №1\n" +
                    "Завдання №1(Лінійний алгоритм): Програма для обчислення числового виразу\n" +
                    "Виконав студент групи ІВ-71\n" +
                    "Гуменюк Олександр Русланович");
            System.out.println("Введіть число a: ");
            while (!scanner.hasNextDouble()){
                System.out.println("Помилка\nВведіть число a : ");
                scanner.next();
            }
            a = scanner.nextDouble();

            System.out.println("Введіть число b: ");
            while (!scanner.hasNextDouble()){
                System.out.println("Помилка\nВведіть число b : ");
                scanner.next();
            }
            b = scanner.nextDouble();


            System.out.println("Введіть число c: ");
            while (!scanner.hasNextDouble()){
                System.out.println("Помилка\nВведіть число c : ");
                scanner.next();
            }
            c = scanner.nextDouble();



            System.out.println("Введіть число d: ");
            while (!scanner.hasNextDouble()){
                System.out.println("Помилка\nВведіть число d : ");
                scanner.next();
            }
            d = scanner.nextDouble();


            while (d == 0){
                System.out.println("Помилка\nВведіть число d : ");
                d = scanner.nextDouble();
            }

            double result_FirstTask = Math.pow((a/d),2) + Math.pow((b/d),3) + (c/2);
        System.out.println("--------------------------------------------------");
        System.out.println("Обчислення функції Y1 = ((a/d)^2) + ((b/d)^3) + (c/2)\n" +
                "Розрахуємо значення функції Y1 при значеннях a = " + a + ",b = " + b + ",c = " + c + ",d = " + d);
        System.out.println("Результат обчислення Y1 = " + result_FirstTask);

        //Завдання №2
        System.out.println("--------------------------------------------------");
        System.out.println("Завдання №2(Розгалужений алгоритм)");


        double f;
        double l;
        double k;
        double w;
        double d_ForSecondTask;


            System.out.println("Введіть число f: ");
            while (!scanner.hasNextDouble()){
                System.out.println("Помилка\nВведіть число f : ");
                scanner.next();
            }
            f = scanner.nextDouble();



            System.out.println("Введіть число l: ");
            while (!scanner.hasNextDouble()){
                System.out.println("Помилка\nВведіть число l : ");
                scanner.next();
            }
            l = scanner.nextDouble();



            System.out.println("Введіть число k: ");
            while (!scanner.hasNextDouble()){
                System.out.println("Помилка\nВведіть число k : ");
                scanner.next();
            }
            k = scanner.nextDouble();



            System.out.println("Введіть число w: ");
            while (!scanner.hasNextDouble()){
                System.out.println("Помилка\nВведіть число w : ");
                scanner.next();
            }
            w = scanner.nextDouble();



            System.out.println("Введіть число d(завдання 2): ");
            while (!scanner.hasNextDouble()){
                System.out.println("Помилка\nВведіть число d(завдання 2) : ");
                scanner.next();
            }
            d_ForSecondTask = scanner.nextDouble();


        double result_SecondTask;
        if (f == 0) {
            result_SecondTask = Math.log10(l*k) + d_ForSecondTask*Math.sin(w*k);
        }
        else {
            result_SecondTask = Math.cos(w*k) + Math.log10(l*k);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Обчислення функції для 2 завдання \nY = lg(l*k) + d*sin(w*k), якщо f = 0,\n" +
                "інакше Y = cos(w*k) + lg(l*k)\n" +
                "Розрахуємо значення функції Y2 при значеннях f = " + f + ",l = " + l + ",k = " + k + ",w = " + w + ",d = " + d_ForSecondTask);
        if (f == 0) {
            System.out.println("Для заданого набору даних при обчисленні використовується наступна формула : Y = lg(l*k) + d*sin(w*k)");
        }
        else {
            System.out.println("Для заданого набору даних при обчисленні використовується наступна формула : Y = cos(w*k) + lg(l*k)");
        }
        System.out.println("Результат обчислення виразу для 2 завдання : Y = " + result_SecondTask);


        //Завдання №3
        System.out.println("--------------------------------------------------");
        System.out.println("Завдання №3(Циклічний алгоритм)");

        int b_ForThirdTask;
        double result_ThirdTask;

            System.out.println("Введіть число b(завдання 3): ");
            while (!scanner.hasNextDouble()){
                System.out.println("Помилка\nВведіть число b(завдання 3) : ");
                scanner.next();
            }
            b_ForThirdTask = scanner.nextInt();

        System.out.println("--------------------------------------------------");
        System.out.println("Обчислення функції для 3 завдання\n" + " f = (Math.sqrt(a^2+b^2) - (a+b)^2)\n" +
                "Обчислимо значення f для заданого значення b за умови, що а змінюється від 4 до 18 з кроком 1");
        for (int a3 = -4; a3 < 19; a3++) {
            result_ThirdTask = Math.sqrt((Math.pow(a3,2) + Math.pow(b_ForThirdTask,2))) - Math.pow((a3+b_ForThirdTask),2);
            System.out.println("Результат обчислення f = " + result_ThirdTask + " при значенні а = " + a3);
        }
    }
}
