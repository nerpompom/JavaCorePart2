package com.company.lesson_1_home_work;

public class Member{
    private String nameOfTheMember;
    private double maxJump;

    public Member(String nameOfTheMember, double maxJump) {

        this.nameOfTheMember = nameOfTheMember;
        this.maxJump = maxJump;
    }

    public String getNameOfTheMember() {
        return nameOfTheMember;
    }

    public double getMaxJump() {return  maxJump;}


     public String toString() {
        return '\n' + "Участник под именем " + nameOfTheMember + " может максимально прыгнуть на " + maxJump + " м " + '\n';
    }
}
