package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){

        int response = 0;

        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. model.Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    AuthUser(1);
                    break;
                case 2:
                    response = 0;
                    AuthUser(2);
                    break;
                case 0:
                    System.out.println("THank you for your visit!");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void AuthUser(int userType){
         //userType = 1 Doctor
         //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Mtz", "Ale@doctor.com"));
        doctors.add(new Doctor("Daniela Garza", "daniela@doctor.com"));
        doctors.add(new Doctor("Claudia Gonzalez", "claudia@doctor.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Jose Z", "jose@patient.com"));
        patients.add(new Patient("Debanhy Trevino", "debanhy@patient.com"));
        patients.add(new Patient("Juan Perez", "juan@patient.com"));

        boolean emailCorrecto = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){
                for (Doctor d : doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrecto = true;
                        //Obtener el usuario loggeado
                        doctorLogged = d;
                        //showDoctorMenu
                    }
                }
            }
            if (userType == 2){
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrecto = true;
                        patientLogged = p;
                        //showPatientMenu
                    }
                }
            }
        }while (!emailCorrecto);
    }

    static void showPatientMenu(){
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++){
                        System.out.println(i + "." + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }


}
