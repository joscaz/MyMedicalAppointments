import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Jose Garza";
        myDoctor.showName();
        myDoctor.showId();
//        System.out.println(Doctor.id);

        Doctor myDoctorJose = new Doctor();
        myDoctor.showId();

        showMenu();
    }

}