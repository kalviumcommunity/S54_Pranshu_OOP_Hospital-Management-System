package hospital;

public class Patient {
    private String name;
    private int id;
    private String medicalRecord;

    // Static variable to keep track of total number of patients
    private static int totalPatients = 0;

    // Constructor
    public Patient(String name, int id, String medicalRecord) {
        this.name = name;
        this.id = id;
        this.medicalRecord = medicalRecord;
        totalPatients++;
    }

    // Accessor (Getter) for name
    public String getName() {
        return name;
    }

    // Mutator (Setter) for name
    public void setName(String name) {
        this.name = name;
    }

    // Accessor (Getter) for medicalRecord
    public String getMedicalRecord() {
        return medicalRecord;
    }

    // Mutator (Setter) for medicalRecord
    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    // Static member function to get total number of patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Add a new medical record
    public void addMedicalRecord(String record) {
        this.medicalRecord += "\n" + record;
    }

    // View patient details
    public String viewPatientDetails() {
        return "Patient Name: " + name + "\nID: " + id + "\nMedical Record: " + medicalRecord;
    }
}