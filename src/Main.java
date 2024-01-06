import javax.print.Doc;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

//        showMenu();

        Doctor myDoctor = new Doctor("Juan Garza", "Cardiólogo");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Jose", "jose@mail.com");
        patient.setWeight(54.6);
        System.out.println(patient.getWeight());
    }

}