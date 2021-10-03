package ua.intita.qa.student;

public abstract class Student {
    private String name;
    private int age;
    private char group;
    private int telephone;
    private boolean isStudent;
    private int scoreWrite;
    private int scoreSpeak;

    abstract int write();

    abstract int speak();


    public Student(String name, char group) {
        this.name = name;
        this.group = group;
    }

    public int getScoreWrite() {
        return scoreWrite;
    }

    public void setScoreWrite(int scoreWrite) {
        this.scoreWrite = scoreWrite;
    }

    public int getScoreSpeak() {
        return scoreSpeak;
    }

    public void setScoreSpeak(int scoreSpeak) {
        this.scoreSpeak = scoreSpeak;
    }

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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                ", telephone=" + telephone +
                '}';
    }
}
