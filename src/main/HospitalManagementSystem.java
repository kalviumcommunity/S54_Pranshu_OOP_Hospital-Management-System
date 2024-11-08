package main;

import hospital.Doctor;
import hospital.Patient;
import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of patients to manage
        System.out.print("Enter the number of patients: ");
        int numPatients = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Dynamically create an array of Patient objects based on user input
        Patient[] patients = new Patient[numPatients];

        // Loop to collect patient data
        for (int i = 0; i < numPatients; i++) {
            System.out.println("Enter details for Patient " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Initial Medical Record: ");
            String medicalRecord = scanner.nextLine();

            // Create each Patient object in the array
            patients[i] = new Patient(name, id, medicalRecord);
        }

        // Create a Doctor object
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiology", "Monday to Friday");

        // Example of using accessor and mutator methods
        System.out.println("Updating doctor availability...");
        doctor1.setAvailability("Tuesday to Friday");
        System.out.println("Updated Doctor Availability: " + doctor1.getAvailability());

        // Adding medical records to each patient and viewing patient details
        for (int i = 0; i < numPatients; i++) {
            // Adding a new medical record for each patient
            patients[i].addMedicalRecord("Appointment on " + (i + 1) + "/09/2024");

            // View patient details using accessor methods
            System.out.println("Patient Name: " + patients[i].getName());
            System.out.println("Medical Record: " + patients[i].getMedicalRecord());
            System.out.println(); // For spacing
        }

        scanner.close();
    }
}