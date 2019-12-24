package dan.herr.san.poo.Session3;

//Clases
public class Doctor {
    //Atributos
    //creando variable estatica
    static int id;
    String name;
    String email;
    String speciality;
    //método cargado por defautl
    Doctor () {
        this.name = "name por default";
        this.speciality = "speciality default";
    }


    /**
     * Método constructor de paciente
     * @param name
     * @param speciality
     */
    Doctor(String name, String speciality) {
        id ++;
        System.out.println(
                String.format("Yo %s me he graduado de medicina estoy listo para atender pacientes",
                        name));
        this.name =name;
        this.speciality =speciality;

    }
    // Comportamientos (métodos):
    public void showName() {
        System.out.println(
                String.format(
                        "Muy buenos días, soy el Doctor %s scuenteme que lo trae por acá", name));
    }

}
