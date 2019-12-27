package dan.herr.san.poo.Session4;

import java.util.ArrayList;
import java.util.Date;

//Clases
public class Doctor {
    //Atributos
    //creando variable estatica
    private static int id;
    private String name;
    private String email;
    private String speciality;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

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


    ArrayList <AvailableAppointment>  availableAppointments = new ArrayList<>();

    /**
     * En esta función se llena la lista availableAppointments con objetos del tipo
     * del tipo AvailableAppointment de forma que creamos una lista con las citas
     * generadas
     * @param date fecha de reserva
     * @param time hora de reserva
     */
    public void  addAvailableAppointments (Date date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public  ArrayList <AvailableAppointment> getAvailableAppointments () {
        return availableAppointments;

    }



    /**
     * En esta clase se define la estructura que deben tener las citas agendas
     */
    public  static  class AvailableAppointment{
        private int id;
        private Date date;
        private  String time;

        /**
         * para crear una cita se pide la fecha y la hora
         * @param date fecha
         * @param time hora
         */
        public AvailableAppointment(Date date, String time) {
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
