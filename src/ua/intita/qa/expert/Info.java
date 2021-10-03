package ua.intita.qa.expert;

import java.io.Serializable;

public class Info implements Serializable {
    private int age;
    private String name;
    private double weight;
    private boolean isStudent;
    private char group;
    private float closeSize;
    private byte averageGrade;
    private Lesson lessons = new Lesson();


    public String[] getLessons() {
        return lessons.getLessons();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    public void setLessons(String[] lessons) {
        this.lessons.setLessons(lessons);
    }

    public Info(String name, char group) {
        this.name = name;
        this.group = group;
    }

    public Info() {}

    public String getName() {
        return name;
    }

    public char getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public float getCloseSize() {
        return closeSize;
    }

    public void setCloseSize(float closeSize) {
        this.closeSize = closeSize;
    }

    public byte getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(byte averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Info{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", isStudent=" + isStudent +
                ", group=" + group +
                ", closeSize=" + closeSize +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
