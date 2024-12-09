package com.company.lesson_3_home_work;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public Double getWeight() {
        Double totalWeight = 0.0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        System.out.println(this.getWeight());
        System.out.println(otherBox.getWeight());
        //return this.getWeight() == otherBox.getWeight();
        if(this.getWeight() == otherBox.getWeight()) return true;
        else return false;

    }

    public void pourFruitsTo(Box<T> otherBox) {
        if (this == otherBox) {
            return; // Нельзя пересыпать в ту же коробку
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear(); // Очищаем текущую коробку
    }
}



