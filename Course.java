package com.company.lesson_1_home_work;

public class Course {
    String result;
    private double first_course;
    private double second_course;
    private double third_course;

    public Course(double first_course, double second_course, double third_course){
        this.first_course = first_course;
        this.second_course = second_course;
        this.third_course = third_course;
    }

    public String doIt(Team team) {
        result = "Команда " + team.getTeamName() + '\n';
        //Цикл. Есть некий итерируемый объект team (массив или коллекция), в которой элементы имеют тип Member (или могут быть к нему приведены).
        // Для каждого элемента выполняется тело цикла, в котором он имеет имя member
        for (Member member: team.getTeam()){
            //+= добавляет результат к result в строке 16
            result += "Участник " + member.getNameOfTheMember() + " " + '\n';
            double value = member.getMaxJump();
            doItFirst_course(value);
            doItSecond_course(value);
            doItThird_course(value);
            Successful(value);
        }
        return result;
    }

    private void doItFirst_course(double value) {
        if(value>first_course) result += "Первое препятствие пройдено" + '\n';
        else result += "Первое препятствие не пройдено" + '\n';
    }

    private void doItSecond_course(double value) {
        if(value>second_course) result += "Второе препятствие пройдено" + '\n';
        else result += "Второе препятствие не пройдено" + '\n';
    }
    private void doItThird_course(double value) {
        if(value>third_course) result += "Третье препятствие пройдено" + '\n';
        else result += "Третье препятствие не пройдено" + '\n';
    }

    private void Successful(double value) {
        if((value>first_course) && (value>second_course) && (value>third_course)) result += "Участником полностью пройдена полоса препятствий" + '\n';

    }

}
