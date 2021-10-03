package ua.intita.qa.expert;

import java.util.Arrays;

public class Lesson {
    private String[] lessons = new String[5];
    public Lesson(){

    }

    public String[] getLessons() {
        return lessons;
    }

    public void setLessons(String[] lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessons=" + Arrays.toString(lessons) +
                '}';
    }
}
