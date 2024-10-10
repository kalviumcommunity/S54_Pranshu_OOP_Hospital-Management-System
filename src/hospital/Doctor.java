package hospital;

public class Doctor {
    private String name;
    private String specialty;
    private String availability;

    // Static variable to keep track of total number of doctors
    private static int totalDoctors = 0;

    // Constructor
    public Doctor(String name, String specialty, String availability) {
        this.name = name;
        this.specialty = specialty;
        this.availability = availability;
        totalDoctors++;  // Increment the static variable when a new doctor is created
    }

    // Getter for total doctors (static method)
    public static int getTotalDoctors() {
        return totalDoctors;
    }

    // Schedule an appointment
    public void scheduleAppointment(String appointmentDetails) {
        System.out.println("Appointment scheduled: " + appointmentDetails);
    }
}