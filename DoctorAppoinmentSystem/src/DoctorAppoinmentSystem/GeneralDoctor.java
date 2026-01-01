package DoctorAppoinmentSystem;

public class GeneralDoctor extends Doctor implements GeneralDoctorInterface {
    public GeneralDoctor(String appointmentId,PatientInterface patient) {
        this.setAppointmentId(appointmentId);
        this.setConsultationFee(getConsultationFee());
        this.setPatient(patient);
    }
    public void bookAppointment() {
        int consultationFee = 200;
        System.out.println("Appointment Booked for:");
        System.out.println(patient.getSymptoms());
        System.out.println("ConsultationFee");
        System.out.println(consultationFee);
    }
}