package hospital;

import java.util.ArrayList;

public class Doctor1 extends Staff {
    private String specialty;
    private ArrayList<String> appointments; // List of scheduled appointments

    // Constructor for initializing Doctor details
    public Doctor1(String name, int id, String specialty) {
        super(name, id); // Call parent class constructor
        this.specialty = specialty;
        this.appointments = new ArrayList<>();
    }

    // Overriding the abstract method from Staff
    @Override
    public void displayDetails() {
        System.out.println("Doctor Details:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Specialty: " + specialty);
        System.out.println();
    }

    // Polymorphism: Method Overloading
    // Schedule appointment with just patient name
    public void scheduleAppointment(String patientName) {
        String appointment = "Appointment scheduled with " + patientName;
        appointments.add(appointment);
        System.out.println(appointment);
    }

    // Schedule appointment with patient name and date
    public void scheduleAppointment(String patientName, String date) {
        String appointment = "Appointment scheduled with " + patientName + " on " + date;
        appointments.add(appointment);
        System.out.println(appointment);
    }

    // Schedule appointment with patient name, date, and time
    public void scheduleAppointment(String patientName, String date, String time) {
        String appointment = "Appointment scheduled with " + patientName + " on " + date + " at " + time;
        appointments.add(appointment);
        System.out.println(appointment);
    }

    // View all scheduled appointments
    public void viewAppointments() {
        System.out.println("Appointments for Dr. " + getName() + ":");
        for (String appointment : appointments) {
            System.out.println(appointment);
        }
        System.out.println();
    }
}