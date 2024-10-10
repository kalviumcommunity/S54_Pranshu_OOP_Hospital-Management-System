package main;

import hospital.Doctor;
import hospital.Patient;
import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of patients: ");
        int numPatients = scanner.nextInt();
        scanner.nextLine(); 

        // Dynamically create an array of Patient objects based on user input
        Patient[] patients = new Patient[numPatients];

        // Loop to collect patient data
        for (int i = 0; i < numPatients; i++) {
            System.out.println("Enter details for Patient " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Initial Medical Record: ");
            String medicalRecord = scanner.nextLine();

            // Dynamically allocate each Patient object in the array
            patients[i] = new Patient(name, id, medicalRecord);
        }

        // Create a Doctor object
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiology", "Monday to Friday");

        // Add medical records to each patient and view patient details
        for (int i = 0; i < numPatients; i++) {
            
            patients[i].addMedicalRecord("Appointment on " + (i + 1) + "/09/2024");

            // View patient details
            System.out.println(patients[i].viewPatientDetails());
            System.out.println(); 
        }

        // Schedule appointments for the patients with the doctor
        for (int i = 0; i < numPatients; i++) {
            doctor1.scheduleAppointment("Appointment with " + patients[i].getName() + " on " + (i + 1) + "/09/2024");
        }

        scanner.close();
    }
}