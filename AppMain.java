package com.company.lesson_3_home_work;

import java.util.Arrays;

// 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

public class AppMain {

    //Массивы ссылочного типа
    static String[] arrayString = {"1", "2", "3", "4"};
    static Integer[] arrayInteger = {1, 2, 3};
    static Double[] arrayDouble = {1d, 2d, 3d, 4d};

    public static void main(String[] args) {

        //Создаем объект swapArray, к которому применяет метод swapElements, подавая на вход массив ссылочного типа, что задали выше.
        //Результат работы метода приводим к String
        //Также с помощью блока try catch пытаемся поймать исключение, когда в массиве нет указанного индекса.
        SwapArray<Object> swapArray = new SwapArray<>();
        try {
            System.out.println(Arrays.toString(swapArray.swapElements(arrayString, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapArray.swapElements(arrayInteger, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
        try {
            System.out.println(Arrays.toString(swapArray.swapElements(arrayDouble, 0, 3)));
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }



    }
}
