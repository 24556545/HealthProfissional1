import java.util.ArrayList;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args){
        // Part 3 – Using classes and objects
        GeneralPractitioner generalPractitioner1 = new GeneralPractitioner(1, "Dr. Smith", "General health", "GP Info 1");
        GeneralPractitioner generalPractitioner2 = new GeneralPractitioner(2, "Dr. Johnson", "Family health", "GP Info 2");
        GeneralPractitioner generalPractitioner3 = new GeneralPractitioner(3, "Dr. Lee", "Pediatric care", "GP Info 3");

        Dietitian dietitian1 = new Dietitian(4, "Dr. Brown", "Nutrition expert", "Diet Info 1");
        Dietitian dietitian2 = new Dietitian(5, "Dr. Davis", "Weight management", "Diet Info 2");

        System.out.println("General Practitioners:");
        generalPractitioner1.printDetails();
        System.out.println("------------------------------");
        generalPractitioner2.printDetails();
        System.out.println("------------------------------");
        generalPractitioner3.printDetails();
        System.out.println("------------------------------");

        System.out.println("Dietitians:");
        dietitian1.printDetails();
        System.out.println("------------------------------");
        dietitian2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        CreateAppointment("Alice", "1234567890", "08:00", generalPractitioner1);
        CreateAppointment("Bob", "0987654321", "10:00", generalPractitioner2);
        CreateAppointment("Charlie", "1231231234", "14:30", dietitian1);
        CreateAppointment("Diana", "3213214321", "16:00", dietitian2);

        System.out.println("------------------------------");
        PrintExistingAppointment();

        System.out.println("------------------------------");
        CancelBooking("0987654321");

        System.out.println("------------------------------");
        PrintExistingAppointment();


    }

    private static void CreateAppointment(String name, String phoneNo, String timeSlot, HealthProfessional doctor) {

        if (name == null || phoneNo == null || timeSlot == null || doctor == null) {
            System.out.println("Invalid appointment details. Appointment not created.");
            return;
        }
        Appointment appointment = new Appointment(name, phoneNo, timeSlot, doctor);
        appointments.add(appointment);
    }

    private static void PrintExistingAppointment() {

        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    private static void CancelBooking(String phoneNo) {

        boolean found = false;

        for (Appointment appointment : appointments) {
            if (appointment.getMobilePhone().equals(phoneNo)) {
                appointments.remove(appointment);
                System.out.println("Appointment cancelled for mobile phone: " + phoneNo);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found for mobile phone: " + phoneNo);
        }
    }
}
