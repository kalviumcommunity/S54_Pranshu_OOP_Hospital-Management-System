package main;

import hospital.Doctor;
import hospital.Doctor1;
import hospital.Patient;
import hospital.Staff;

public class HospitalManagementSystem {
    public static void main(String[] args) {


          Staff doctor1 = new Doctor1("Dr. John", 101, "Cardiology");
        doctor1.scheduleAppointment("John Doe"); // Only patient name
        doctor1.scheduleAppointment("Jane Smith", "25/11/2024"); // Patient name and date
        doctor1.scheduleAppointment("Michael Brown", "26/11/2024", "10:00 AM"); // Name, date, and time
          doctor1.displayDetails();


        // Using default constructor
        Patient defaultPatient = new Patient();
        System.out.println(defaultPatient.viewPatientDetails());

        // Using parameterized constructor
        Patient patient1 = new Patient("John Doe", 1, "No previous records");
        Patient patient2 = new Patient("Jane Smith", 2, "Allergic to penicillin");

        // Using default constructor for Doctor
        Doctor defaultDoctor = new Doctor();
        System.out.println(defaultDoctor.viewDoctorDetails());

        // Using parameterized constructor for Doctor
        Doctor doctor12 = new Doctor("Dr. Smith", "Cardiology", "Monday to Friday");

        // Adding medical records
        patient1.addMedicalRecord("Check-up on 01/09/2024");
        patient2.addMedicalRecord("Allergy test on 02/09/2024");

        // Scheduling appointments
        doctor1.scheduleAppointment("Check-up with John Doe on 01/09/2024");

        // Display details
        System.out.println(patient1.viewPatientDetails());
        System.out.println(patient2.viewPatientDetails());
        System.out.println(doctor1.viewDoctorDetails());
    }
}