package DoctorAppoinmentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Patient patient1 = new Patient();
        System.out.println("Enter symptoms for Patient 1:");
        patient1.setSymptoms(sc.nextLine());
        System.out.println("Enter doctor type for Patient 1:");
        patient1.setDoctorType(sc.nextLine());
        if (patient1.getDoctorType()=="General") {
            GeneralDoctor gd1 = new GeneralDoctor("A101", patient1);
            patient1.setGeneralDoctor(gd1);
            gd1.bookAppointment();
            System.out.println("PATIENT1:");
            System.out.println("Consultation Fee: ");
            System.out.println(gd1.getConsultationFee());
            System.out.println("AppointmentId: ");
            System.out.println(gd1.getAppointmentId());

        }
        else {
            SpecialistDoctor sd1 = new SpecialistDoctor("A202", patient1);
            patient1.setSpecialistDoctor(sd1);
            sd1.bookAppointment();
            System.out.println("PATIENT1:");
            System.out.println("Consultation Fee: ");
            System.out.println(sd1.getConsultationFee());
            System.out.println("AppointmentId: ");
            System.out.println(sd1.getAppointmentId());
        }

        Patient patient2 = new Patient();
        System.out.println("Enter symptoms for Patient 2:");
        patient2.setSymptoms(sc.nextLine());
        System.out.println("Enter doctor type for Patient 2:");
        patient2.setDoctorType(sc.nextLine());
        if (patient2.getDoctorType()=="General") {

            GeneralDoctor gd2 = new GeneralDoctor("A101", patient2);
            patient2.setGeneralDoctor(gd2);
            gd2.bookAppointment();
            System.out.println("PATIENT2:");
            System.out.println("Consultation Fee: ");
            System.out.println(gd2.getConsultationFee());
            System.out.println("AppointmentId: ");
            System.out.println(gd2.getAppointmentId());

        }
        else {
            SpecialistDoctor sd2 = new SpecialistDoctor("A202", patient2);
            patient2.setSpecialistDoctor(sd2);
            sd2.bookAppointment();
            System.out.println("PATIENT2:");
            System.out.println("Consultation Fee: ");
            System.out.println(sd2.getConsultationFee());
            System.out.println("AppointmentId: ");
            System.out.println(sd2.getAppointmentId());
        }
    }
}
