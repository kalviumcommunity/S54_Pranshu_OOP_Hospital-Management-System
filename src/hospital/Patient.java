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
        totalPatients++;  // Increment the static variable when a new patient is created
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for total patients (static method)
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