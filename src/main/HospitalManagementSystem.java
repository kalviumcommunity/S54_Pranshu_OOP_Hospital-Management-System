package main;

import hospital.Doctor;
import hospital.Patient;

public class HospitalManagementSystem {
    public static void main(String[] args) {
      
        // Create an array of Patient objects
        Patient[] patients = new Patient[5];  

        // Initializing each Patient object in the array
        patients[0] = new Patient("John Doe", 1, "No previous records");
        patients[1] = new Patient("Jane Smith", 2, "Allergic to penicillin");
        patients[2] = new Patient("Michael Johnson", 3, "Diabetic, high blood pressure");
        patients[3] = new Patient("Emily Davis", 4, "No known allergies, past surgery");
        patients[4] = new Patient("Chris Brown", 5, "Asthmatic");


        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiology", "Monday to Friday");

        // Add medical records to each patient
        patients[0].addMedicalRecord("Check-up on 01/09/2024");
        patients[1].addMedicalRecord("Allergy test on 02/09/2024");
        patients[2].addMedicalRecord("Diabetes check on 03/09/2024");
        patients[3].addMedicalRecord("Post-surgery follow-up on 04/09/2024");
        patients[4].addMedicalRecord("Asthma test on 05/09/2024");

        // View patient details for each patient in the array
        for (Patient patient : patients) {
            System.out.println(patient.viewPatientDetails());
            System.out.println();  
        }

        // Scheduling appointments for the patients with the doctor
        doctor1.scheduleAppointment("Check-up with John Doe on 01/09/2024");
        doctor1.scheduleAppointment("Allergy test with Jane Smith on 02/09/2024");
        doctor1.scheduleAppointment("Diabetes check with Michael Johnson on 03/09/2024");
        doctor1.scheduleAppointment("Post-surgery follow-up with Emily Davis on 04/09/2024");
        doctor1.scheduleAppointment("Asthma test with Chris Brown on 05/09/2024");
    }
}