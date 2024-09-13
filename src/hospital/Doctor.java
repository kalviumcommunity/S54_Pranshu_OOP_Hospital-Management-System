package hospital;

public class Doctor {
  private String name;
  private String specialization;
  private String schedule;

  public Doctor(String name, String specialization, String schedule) {
      this.name = name;
      this.specialization = specialization;
      this.schedule = schedule;
  }

  public void scheduleAppointment(String appointment) {
      this.schedule += "\n" + appointment;
  }

  public void updateDoctorDetails(String name, String specialization) {
      this.name = name;
      this.specialization = specialization;
  }
}