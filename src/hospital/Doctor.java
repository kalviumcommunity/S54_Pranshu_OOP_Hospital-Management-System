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
        totalDoctors++;
    }

    // Accessor (Getter) for name
    public String getName() {
        return name;
    }

    // Mutator (Setter) for name
    public void setName(String name) {
        this.name = name;
    }

    // Accessor (Getter) for specialty
    public String getSpecialty() {
        return specialty;
    }

    // Mutator (Setter) for specialty
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    // Static member function to get total number of doctors
    public static int getTotalDoctors() {
        return totalDoctors;
    }

    // Accessor (Getter) for availability
    public String getAvailability() {
        return availability;
    }

    // Mutator (Setter) for availability
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    // Schedule an appointment
    public void scheduleAppointment(String appointmentDetails) {
        System.out.println("Appointment scheduled: " + appointmentDetails);
    }
}