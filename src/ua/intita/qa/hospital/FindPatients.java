package ua.intita.qa.hospital;

public class FindPatients {
    private Patient[] patients;
    private int count = 0;

    public FindPatients(Patient[] patients) {
        this.patients = patients;
    }

    public Patient[] printListOfPatients(String diagnosis) {
        for (Patient patient : patients) {
            if (diagnosis.equals(patient.getDiagnosis())) {
                count++;
            }
        }
        // System.out.println(count);
        Patient[] listPatients = new Patient[count];
        count = 0;
        for (Patient patient : patients) {
            if (diagnosis.equals(patient.getDiagnosis())) {
                listPatients[count++] = patient;
            }
        }
        return listPatients;
    }

    public Patient[] printListOfPatients(int from, int to) {
        for (Patient patient : patients) {
            if (patient.getMedicineCardNumber() >= from && patient.getMedicineCardNumber() <= to) {
                //System.out.println(patient.getMedicineCardNumber());
                count++;
            }
        }
        System.out.println(count);
        Patient[] listPatients = new Patient[count];
        count = 0;
        for (Patient patient : patients) {
            if (patient.getMedicineCardNumber() >= from && patient.getMedicineCardNumber() <= to) {
                listPatients[count++] = patient;
            }
        }
        return listPatients;
    }
}
