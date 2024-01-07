import javax.print.Doc;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

//        showMenu();

        Doctor myDoctor = new Doctor("Juan Garza", "Cardiólogo");
        myDoctor.addAvailableAppointments(new Date(), "4pm");
        myDoctor.addAvailableAppointments(new Date(), "10am");
        myDoctor.addAvailableAppointments(new Date(), "1pm");

        for (Doctor.AvailableAppointments aA : myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Jose", "jose@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());


    }

}