public class Appointment {

    private String name;
    private String phoneNo;
    private String timeSlot;
    private HealthProfessional doctor;

    public Appointment() {
    }

    public Appointment(String name, String phoneNo, String timeSlot, HealthProfessional doctor) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    public void printDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Mobile Phone: " + phoneNo);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor Details:");
        doctor.printDetails();
    }

    public String getMobilePhone() {
        return phoneNo;
    }



}