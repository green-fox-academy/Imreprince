package com.greenfoxacademy.expressions_and_control_flow;

public class CodingHours {
    public static void main(String[] args) {

        int codingTime = 6;
        int semester = 17;
        int everydaylife = 5;
        int workTime = codingTime * semester * everydaylife;

        System.out.println(workTime);

        int avarageWorkTime = 52;
        int avarageWorkTimeForSemester = avarageWorkTime * semester;

        System.out.println(avarageWorkTimeForSemester);

        double semesterPercent = 510.0 / 884. * 100.;
        System.out.printf("A félév %.0f százalékát tölti a hallgató programozással." , semesterPercent);


    }
}
