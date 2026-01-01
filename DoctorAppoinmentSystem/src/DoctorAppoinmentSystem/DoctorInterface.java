package DoctorAppoinmentSystem;

public interface DoctorInterface {
    public String getAppointmentId();
    public void setAppointmentId(String appointmentId);
    public int getConsultationFee();
    public void setConsultationFee(int consultationFee);
    public PatientInterface getPatient();
}
