package model;

public class Nurse extends User{

    private String specialty;

    public Nurse(String name, String email){
        super(name, email);

    }

    @Override
    public void showDataUser(){
        System.out.println("Empleado del hospital: Cruz Verde");
        System.out.println("Departamentos: Nutriología, Pediatría");
    }

    public String getSpecialty(){
        return specialty;
    }

    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }
}
