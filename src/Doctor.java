import javax.print.Doc;

public class Doctor {
    static int id = 0; //Autoincrement
    String name;
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
}
