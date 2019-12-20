package dan.herr.san.poo.Session1;
//Clases
public class Doctor {
    //Atributos
    //creando variable estatica
    static int id;
    String name;
    String speciality;
    //Método constructor
    Doctor (String name) {
        System.out.println(
                String.format("Yo %s me he graduado de medicina estoy listo para atender pacientes",
                        name));

    }
    // Comportamientos (métodos):
    public void showName() {
        System.out.println(
                String.format(
                        "Muy buenos días, soy el Doctor %s scuenteme que lo trae por acá", name));
    }

}
