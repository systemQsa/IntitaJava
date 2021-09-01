package ua.intita.qa.hospital;

public class Main {
    public static void main(String[] args) {

        Patient[] patients = new Patient[5];
        patients[0] = new Patient("sara", "parker", "cancer");
        patients[1] = new Patient("peter", "brukovkiy", "fever");
        patients[2] = new Patient(124, "david", "gragory");
        patients[3] = new Patient("max", "marwell", "fever");
        patients[4] = new Patient(126, "sam", "mackduck");


        FindPatients find = new FindPatients(patients);
        Patient[] people = find.printListOfPatients(100, 130);
        for (Patient person : people) {
            System.out.println(person);
        }
    }
}
