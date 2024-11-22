package hospital;

public class Patient {
    // Private attributes
    private String name;
    private int id;
    private String medicalRecord;

    // Default constructor
    public Patient() {
        this.name = "Unknown";
        this.id = 0;
        this.medicalRecord = "No medical record available";
        System.out.println("Default constructor called for Patient");
    }

    // Parameterized constructor
    public Patient(String name, int id, String medicalRecord) {
        this.name = name;
        this.id = id;
        this.medicalRecord = medicalRecord;
        System.out.println("Parameterized constructor called for Patient: " + name);
    }

    // Accessor and mutator for name (demonstrating encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Public method to add a medical record
    public void addMedicalRecord(String record) {
        this.medicalRecord += "\n" + record;
    }

    // Public method to view patient details
    public String viewPatientDetails() {
        return "Patient ID: " + id + "\nName: " + name + "\nMedical Record: " + medicalRecord;
    }
}

