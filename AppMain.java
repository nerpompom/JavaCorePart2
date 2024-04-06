package com.company.lesson_2_home_work;

public class AppMain {


    public static void main(String[] args) {

        //Задание 1. Массив без исключения. Задание 2. Массив с исключением.
       String[][] array1 = {{"1", "2", "три", "4"}, {"5", "6", "7", "8"}, {"девять", "10", "11", "двенадцать"}, {"13", "14", "15", "16"}};
       //Задание 1. Массив с исключением.
       String[][] array2 = {{"1", "два"}, {"три", "64"}, {"5", "6"}, {"семь", "восемь"}};
       //Задание 2. Массив без исключения.
       String[][] array3 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        //Задание 3.
        //В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.

        try {
            System.out.println("Условие для задания 3 выполнено: сумма массива = " + getSum(array1));
        }
        catch (MyArraySizeException | MyArrayDataException ex) {
            //Можно вывести детализацию по исключению
            //ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Условие для задания 3 выполнено: сумма массива = " + getSum(array2));
        }
        catch (MyArraySizeException | MyArrayDataException ex) {
            //ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Условие для задания 3 выполнено: сумма массива = " + getSum(array3));
        }
        catch (MyArraySizeException | MyArrayDataException ex) {
            //ex.printStackTrace();
            System.out.println(ex.getMessage());
        }



    }

    //    Задание 1.
    //    Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    //    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    public static void checkArraySize (String[][] array) throws MyArraySizeException {
        //Отличие && и || от & и |. Если &, то проверяются оба операнда, если &&, то при false слева, оператор справа уже не проверяется

        if(array.length != 4 || array[0].length != 4) throw new MyArraySizeException();
        System.out.println("Условие для задания 1 выполнено: массив размера 4х4");
    }

    //Задание 2.
    //Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    // должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    public static Integer getSum (String[][] array) throws MyArraySizeException, MyArrayDataException{
        //Метод для проверки длины массива положили в метод для суммирования массива
        //Благодаря тому что мы вызвали здесь метод checkArraySize(array), если в нем будет исключение (массив иного размера), то мы его для работы не получим
        checkArraySize(array);

        //Можно было бы создать числовой массив такой же длины как строковый массив на входе метода и переписать туда значения пройдясь по циклу (закомментированный ниже код)
        //int[][] ints = new int[array.length][array[0].length];
        Integer sum = 0;
        int i = 0;
        int j = 0;

        try {
            for (; i < 4; i++) {
                //В первом цикле for переменная j приравнивается к 0 для того, чтобы обеспечить начальное значение счетчика j перед началом каждой итерации цикла.
                // Это позволяет гарантировать, что при каждом новом проходе по внутреннему циклу for счетчик j будет снова установлен в 0,
                // и процесс итерации по столбцам массива начнется заново с первого столбца.
                //Таким образом, при каждой итерации внешнего цикла for (по строкам массива) внутренний счетчик j снова устанавливается в 0,
                // чтобы начать итерацию по столбцам с самого начала.
                j=0;
                for (; j < 4; j++){
                    //ints[i][j] = Integer.parseInt(array[i][j]);
                    sum = sum + Integer.parseInt(array[i][j]);
                }
            }

        }
        catch (NumberFormatException ex) {
            throw new MyArrayDataException("Условие для задания 2 не выполнено: ошибка в элементе [" +i +"] [" +j +"]");
        }

        return sum;

    }

}
