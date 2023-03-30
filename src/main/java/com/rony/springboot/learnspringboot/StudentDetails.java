package com.rony.springboot.learnspringboot;

public class StudentDetails {

    private String USN;
    private String name;
    private String Dept;

    public StudentDetails(String USN, String name, String dept) {
        this.USN = USN;
        this.name = name;
        Dept = dept;
    }

    public String getUSN() {
        return USN;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return Dept;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "USN='" + USN + '\'' +
                ", name='" + name + '\'' +
                ", Dept='" + Dept + '\'' +
                '}';
    }
}
