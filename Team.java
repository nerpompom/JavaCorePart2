package com.company.lesson_1_home_work;

import java.util.Arrays;

public class Team {
    private String teamName;
    private Member[] team;

    public Team(String teamName, Member[] team) {
        this.teamName = teamName;
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public Member[] getTeam() {
        return team;
    }

    public void memberInfo (Member[] team) {
        //Arrays.toString для вывода информации о массиве
        System.out.println(Arrays.toString(team));
    }

}
