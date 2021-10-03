package ua.intita.qa.student;

public class Main1 {
    public static void main(String[] args) {
        PartTimeStudent student = new PartTimeStudent("Markus", 'A');
        student.setAge(19);
        student.setTelephone(12345678);
        student.setScoreWrite(30);
        student.setScoreSpeak(46);
        System.out.println(student.gotPoints());
        student.passExam();

    }
}
