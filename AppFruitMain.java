package com.company.lesson_3_home_work;

import com.company.lesson_3.BoxWithNumbers;

public class AppFruitMain {


    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());


        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        //Почему-то дает false, хотя весь равен в коробках
        //А также если сделать еще одну коробку яблоками, то будет считаться что все яблоки в первой коробке, а не в этой.
        System.out.println("Коробки равны по весу? " + appleBox.compare(orangeBox));

         //Пересыпаем яблоки в другую коробку (нельзя, так как разные типы)
         //appleBox.pourFruitsTo(orangeBox); // Это вызовет ошибку компиляции

    }
}
