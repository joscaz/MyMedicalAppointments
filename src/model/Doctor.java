package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //Atributos
    String speciality;

    public String getSpeciality(){
        return speciality;
    }

    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del model.Doctor asignado es: " + name);
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointments> availableAppointments = new ArrayList<>();
    public void addAvailableAppointments(String date, String time){
        availableAppointments.add(new AvailableAppointments(date, time));
    }

    public ArrayList<AvailableAppointments> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public void showDataUser(){
        System.out.println("Empleado del hospital: Cruz Roja");
        System.out.println("Departamento: Cancerologia");
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    public static class AvailableAppointments{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointments(String date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
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

        public String getDate(String DATE){
            return format.format(date);
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

        @Override
        public String toString() {
            return "Available Appointments: \nDate: " + date + "\nTime: " + time;
        }
    }
}
