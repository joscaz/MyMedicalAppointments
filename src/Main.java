import model.Doctor;
import model.Patient;

import java.util.Date;

//import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

//        showMenu();

        Doctor myDoctor = new Doctor("Juan Garza", "Cardiólogo");
        myDoctor.addAvailableAppointments(new Date(), "4pm");
        myDoctor.addAvailableAppointments(new Date(), "10am");
        myDoctor.addAvailableAppointments(new Date(), "1pm");

        System.out.println(myDoctor);
//        for (model.Doctor.AvailableAppointments aA : myDoctor.getAvailableAppointments()){
//            System.out.println(aA.getDate() + " " + aA.getTime());
//        }

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "ale@ale.com");

        System.out.println(patient);
    }

}