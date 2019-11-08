package DbBest_Tasks;

//1. Создать двумерный массив строковых данных.
// Пользователь вводит с консоли два произвольных числа (в рамках размера массива)
// и приложение выводит соответствующий элемент массива.

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        System.out.println("Ниже представлен двумерный массив строковых данных:");
        System.out.println();
        String[][] array = {{"дом", "дверь", "окно"}, {"комната", "кухня", "спальня"}};
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(array[row][column] + "\t");
            }
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите первое произвольное число от 1 до 6:");
        int num1;

        while (true) {
            while (!in.hasNextInt()) {
                in.next();
                System.out.println("Вы ввели не число.");
                System.out.println("Повторите попытку.");
            }
            num1 = in.nextInt();
            if ((num1 >= 1 && num1 <= 6)) {
                break;
            }
            System.out.println("Вы ввели число вне диапазона.");
            System.out.println("Повторите попытку.");
        }
        {
            switch (num1) {
                case 1:
                    System.out.println("Первый элемент массива: " + array[0][0] + " ");
                    break;
                case 2:
                    System.out.println("Второй элемент массива: " + array[0][1] + " ");
                    break;
                case 3:
                    System.out.println("Третий элемент массива: " + array[0][2] + " ");
                    break;
                case 4:
                    System.out.println("Четвертый элемент массива: " + array[1][0] + " ");
                    break;
                case 5:
                    System.out.println("Пятый элемент массива: " + array[1][1] + " ");
                    break;
                case 6:
                    System.out.println("Шестой элемент массива: " + array[1][2] + " ");
                    break;
                default:
                    System.out.println("Вы ввели число вне диапазона.");
                    break;

            }

            System.out.println("Введите второе произвольное число от 1 до 6:");
            int num2;

            while (true) {
                while (!in.hasNextInt()) {
                    in.next();
                    System.out.println("Вы ввели не число.");
                    System.out.println("Повторите попытку.");
                }
                num2 = in.nextInt();
                if ((num2 >= 1 && num2 <= 6)) {
                    break;
                }
                System.out.println("Вы ввели число вне диапазона.");
                System.out.println("Повторите попытку.");
            }
            {
                switch (num2) {
                    case 1:
                        System.out.println("Первый элемент массива: " + array[0][0] + " ");
                        break;
                    case 2:
                        System.out.println("Второй элемент массива: " + array[0][1] + " ");
                        break;
                    case 3:
                        System.out.println("Третий элемент массива: " + array[0][2] + " ");
                        break;
                    case 4:
                        System.out.println("Четвертый элемент массива: " + array[1][0] + " ");
                        break;
                    case 5:
                        System.out.println("Пятый элемент массива: " + array[1][1] + " ");
                        break;
                    case 6:
                        System.out.println("Шестой элемент массива: " + array[1][2] + " ");
                        break;
                    default:
                        System.out.println("Вы ввели число вне диапазона.");
                        break;
                }
            }
        }
    }
}