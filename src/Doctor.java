import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String email;
    String speciality;

    Doctor(){
         System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    //Comportamientos
    public void showName(){
        System.out.println(this.name);
    }

    public void showId(){
        System.out.println("ID doctor: " + id);
    }

    ArrayList<AvailableAppointments> availableAppointments = new ArrayList<>();
    public void addAvailableAppointments(Date date, String time){
        availableAppointments.add(new AvailableAppointments(date, time));
    }

    public ArrayList<AvailableAppointments> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointments{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointments(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
