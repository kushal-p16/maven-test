package com.example.maven_github_demo1;

public class GradeCalculator {
    public int total(int a, int b, int c) {
        return a + b + c;
    }

    public double average(int a, int b, int c) {
        return total(a, b, c) / 3.0;
    }

    public String result(double average) {
        return average >= 40 ? "PASS" : "FAIL";
    }

    public static void main(String[] args) {
        GradeCalculator g = new GradeCalculator();
        int total = g.total(70, 80, 75);
        double average = g.average(70, 80, 75);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Result  : " + g.result(average));
    }
}