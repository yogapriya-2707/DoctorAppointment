package DoctorAppoinmentSystem;

public class Doctor implements DoctorInterface {
    private String appointmentId;
    private int consultationFee;
    public PatientInterface patient;

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(int consultationFee) {
        this.consultationFee = consultationFee;
    }

    public PatientInterface getPatient() {
        return patient;
    }

    public void setPatient(PatientInterface patient) {
        this.patient = patient;
    }
}
