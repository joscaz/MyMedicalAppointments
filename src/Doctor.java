import javax.print.Doc;

public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del Doctor asignado es: " + name);
    }
    //Comportamientos
    public void showName(){
        System.out.println(this.name);
    }

    public void showId(){
        System.out.println("ID doctor: " + id);
    }
}