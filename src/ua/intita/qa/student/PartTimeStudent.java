package ua.intita.qa.student;

public class PartTimeStudent extends Student implements Applicant {

    public PartTimeStudent(String name, char group) {
        super(name, group);
    }

    @Override
    public void passExam() {
        if (credited()) {
            System.out.println(getName() + " passed exams successfully");
        } else {
            System.out.println(getName() + " did not pass exams");
        }
    }

    @Override
    public boolean credited() {
        if (gotPoints() > 70) {
            setStudent(true);
            return true;
        }
        setStudent(false);
        return false;
    }

    @Override
    public int gotPoints() {
        return write() + speak();
    }

    @Override
    int write() {
        return getScoreWrite();
    }

    @Override
    int speak() {
        return getScoreSpeak();
    }


}
