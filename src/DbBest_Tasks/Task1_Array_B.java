package DbBest_Tasks;

//1. Создать двумерный массив строковых данных.
// Пользователь вводит с консоли два произвольных числа (в рамках размера массива)
// и приложение выводит соответствующий элемент массива.

import java.util.Scanner;

public class Task1_Array_B {

    public static void main(String[] args) {
        System.out.println("Ниже представлен двумерный массив строковых данных:");
        System.out.println();
        String[][] array = {{"дом", "дверь", "окно"}, {"комната", "кухня", "спальня"}};
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + "  ");
            }
            System.out.println("");
        }

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите индекс необходимого массива:");
        int num1;

        while (true) {
            while (!in.hasNextInt()) {
                in.next();
                System.out.println("Вы ввели не индекс.");
                System.out.println("Повторите попытку.");
            }
            num1 = in.nextInt();
            if ((num1 >= 0 && num1 <= array.length - 1)) {
                break;
            }
            System.out.println("Вы ввели индекс вне диапазона.");
            System.out.println("Повторите попытку.");
        }

        System.out.println();
        System.out.println("Введите индекс элемента массива " + num1 + ": ");
        int num2;

        while (true) {
            while (!in.hasNextInt()) {
                in.next();
                System.out.println("Вы ввели не индекс.");
                System.out.println("Повторите попытку.");
            }
            num2 = in.nextInt();
            if ((num2 >= 0 && num2 <= array[0].length - 1)) {
                break;
            }
            System.out.println("Вы ввели индекс вне диапазона.");
            System.out.println("Повторите попытку.");
        }

        System.out.println("Соответствующий элемент массива: " + array[num1][num2] + " ");
    }
}