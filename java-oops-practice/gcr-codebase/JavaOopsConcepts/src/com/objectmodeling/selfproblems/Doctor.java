package com.objectmodeling.selfproblems;

class Doctor {
    String name;
    Patient[] patients;
    int patientCount = 0;

    Doctor(String name, int maxPatients) {
        this.name = name;
        patients = new Patient[maxPatients];
    }

    // Communication method
    void consult(Patient patient) {
        patients[patientCount++] = patient;
        patient.addDoctor(this);   // two-way association

        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
    }

    void showPatients() {
        System.out.println("Dr. " + name + " consulted patients:");
        for (int i = 0; i < patientCount; i++) {
            System.out.println("- " + patients[i].name);
        }
    }
}

