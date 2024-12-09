package com.company.lesson_3_home_work;

//Обобщение SwapArray <T>, в котором создали метод swapElements. Метод принимает на вход массив элементов <T> (два индекса)
//Метод с помощью промежуточной переменной intermediate меняет два элемента массива.

public class SwapArray <T>{

    T intermediate;

    public T[] swapElements(T[] array, int indexA, int indexB){
        intermediate = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = intermediate;
        return array;
    }

}
