import java.util.ArrayList;

class Patient {
    private String name;
    private ArrayList<Doctor> consultedDoctors;

    public Patient(String name) {
        this.name = name;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!consultedDoctors.contains(doctor)) {
            consultedDoctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("Patient: " + name + " has consulted:");
        for (Doctor d : consultedDoctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }
}

class Doctor {
    private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
        patient.addDoctor(this); // two-way association

        // Communication
        System.out.println(
                "Dr. " + name + " (Specialist in " + specialization + ") is consulting patient " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

public class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalData() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }

    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor drSmith = new Doctor("Smith", "Cardiology");
        Doctor drJones = new Doctor("Jones", "Neurology");

        // Create patients
        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");

        // Add to hospital
        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(alice);
        hospital.addPatient(bob);

        // Consultations
        drSmith.consult(alice);
        drSmith.consult(bob);
        drJones.consult(alice);

        // Display data
        hospital.showHospitalData();
        drSmith.showPatients();
        drJones.showPatients();
        alice.showDoctors();
        bob.showDoctors();
    }
}
