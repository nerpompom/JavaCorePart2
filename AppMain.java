package com.company.lesson_1_home_work;

import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {

        Member[] member = new Member[4];
        member[0] = new Member("Иван", 2.3);
        member[1] = new Member("Ольга", 1.8);
        member[2] = new Member("Андрей", 3.0);
        member[3] = new Member("Ирина", 2.8);

        Team team = new Team("Невероятные", member);
        team.memberInfo(member);
        //System.out.println(member[0].toString()); - для отдельного участника команды

        Course course = new Course(1.5, 1.9, 2.9);
        String result = course.doIt(team);
        System.out.println(result);

    }
}
