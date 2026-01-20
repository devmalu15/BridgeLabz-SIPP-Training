import java.util.ArrayList;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String diagnosis);

    void viewRecords();
}

// InPatient subclass
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int numberOfDays;
    private ArrayList<String> medicalHistory = new ArrayList<>();

    public InPatient(String patientId, String name, int age, double dailyRate, int numberOfDays) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.numberOfDays = numberOfDays;
    }

    @Override
    public double calculateBill() {
        return dailyRate * numberOfDays;
    }

    @Override
    public void addRecord(String diagnosis) {
        medicalHistory.add(maskDiagnosis(diagnosis));
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical history (masked): " + medicalHistory);
    }

    private String maskDiagnosis(String diagnosis) {
        if (diagnosis.length() > 3) {
            return diagnosis.substring(0, 2) + "***";
        }
        return "***";
    }
}

// OutPatient subclass
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private ArrayList<String> medicalHistory = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String diagnosis) {
        medicalHistory.add(maskDiagnosis(diagnosis));
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical history (masked): " + medicalHistory);
    }

    private String maskDiagnosis(String diagnosis) {
        if (diagnosis.length() > 3) {
            return diagnosis.substring(0, 2) + "***";
        }
        return "***";
    }
}

// Main class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();

        InPatient ip = new InPatient("P101", "Alice", 30, 2000, 5);
        ip.addRecord("Typhoid Fever");

        OutPatient op = new OutPatient("P102", "Bob", 40, 500);
        op.addRecord("Migraine");

        patients.add(ip);
        patients.add(op);

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) p;
                mr.viewRecords();
            }
            System.out.println("------------------------------");
        }
    }
}
