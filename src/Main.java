import model.*;

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

        User user = new Doctor("Jose", "jose@gmail.com");
        user.showDataUser();

        User userPatient = new Patient("Jose", "jose@gmail.com");
        userPatient.showDataUser();

        //Clase anonima
        User user1 = new User("Jose", "jose@a.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Cruz verde");
                System.out.println("Departamento: Geriatría");
            }
        };

        user1.showDataUser();

        // Clase anonima
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };


//        System.out.println();
//        System.out.println();
//        Patient patient = new Patient("Alejandra", "ale@ale.com");
//
//        System.out.println(patient);
    }

}