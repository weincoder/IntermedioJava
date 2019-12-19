package dan.herr.san.poo;
//Clases
public class Doctor {
    //Atributos
    int id;
    String name;
    String speciality;

    // Comportamientos (métodos):
    public void showName() {
        System.out.println(
                String.format(
                        "Muy buenos días, soy el Doctor %s scuenteme que lo trae por acá", name));
    }

}
