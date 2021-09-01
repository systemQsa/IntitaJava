package ua.intita.qa.hospital;

public class Patient {
    private int id;
    private String surname;
    private String name;
    private String address;
    private int phoneNumber;
    private int medicineCardNumber;
    private String diagnosis;


    public Patient(String name, String surname, String diagnosis) {
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
    }

    public Patient(int medicineCardNumber, String name, String surname) {
        this.medicineCardNumber = medicineCardNumber;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedicineCardNumber() {
        return medicineCardNumber;
    }

    public void setMedicineCardNumber(int medicineCardNumber) {
        this.medicineCardNumber = medicineCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", medicineCardNumber=" + medicineCardNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
