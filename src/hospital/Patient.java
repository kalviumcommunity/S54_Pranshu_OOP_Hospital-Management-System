package hospital;
public class Patient {
  private String name;
  private int id;
  private String medicalHistory;

  public Patient(String name, int id, String medicalHistory) {
      this.name = name;
      this.id = id;
      this.medicalHistory = medicalHistory;
  }

  public void addMedicalRecord(String record) {
      this.medicalHistory += "\n" + record;
  }

  public String viewPatientDetails() {
      return "Name: " + name + "\nID: " + id + "\nMedical History: " + medicalHistory;
  }
}