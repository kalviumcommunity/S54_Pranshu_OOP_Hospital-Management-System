package hospital;

public class Doctor {
    // Private attributes
    private String name;
    private String specialty;
    private String availability;

    // Default constructor
    public Doctor() {
        this.name = "Unknown Doctor";
        this.specialty = "General";
        this.availability = "Unknown";
        System.out.println("Default constructor called for Doctor");
    }

    // Parameterized constructor
    public Doctor(String name, String specialty, String availability) {
        this.name = name;
        this.specialty = specialty;
        this.availability = availability;
        System.out.println("Parameterized constructor called for Doctor: " + name);
    }

    // Public method to schedule an appointment
    public void scheduleAppointment(String appointmentDetails) {
        System.out.println("Appointment scheduled with " + name + ": " + appointmentDetails);
    }

    // Public method to view doctor details
    public String viewDoctorDetails() {
        return "Doctor Name: " + name + "\nSpecialty: " + specialty + "\nAvailability: " + availability;
    }
}