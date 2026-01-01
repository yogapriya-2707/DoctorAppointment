package DoctorAppoinmentSystem;

public class SpecialistDoctor extends Doctor implements SpecialistDoctorInterface {

    public SpecialistDoctor(String appointmentId,PatientInterface patient) {
        this.setAppointmentId(appointmentId);
        this.setConsultationFee(getConsultationFee());
        this.setPatient(patient);
    }
    public void bookAppointment(){
        int consultationFee = 500;
        System.out.println("Appointment Booked for:");
        System.out.println(patient.getSymptoms());
        System.out.println("consultationFee");
        System.out.println(consultationFee);
    }
}

