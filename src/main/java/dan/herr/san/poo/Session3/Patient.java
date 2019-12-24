package dan.herr.san.poo.Session3;

public class Patient {
    int id;
    String name;
    String email;
    String addres;
    String phoneNumber;
    String birthdy;
    String weight;
    String height;
    String blood;

    /**
     * Constructor de la clase paciente
     * @param name Nombre del paciente
     * @param email e-mail del paciente
     */
    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }
}
