package dan.herr.san.poo.Session3;

import java.util.Date;

import static dan.herr.san.poo.Session2.ui.UIMenu.showMenu;


public class ExampleClasesAnidadas {
    public static void main(String[] args) {


        //Declarando un objeto tipo doctor
        Doctor newDoctor;


        //instanciar el objeto
        newDoctor = new Doctor("Daniel Herrera", "Neurologo");

        Patient newPatient = new Patient("Maria Fernanda","mafer@gmail.com");
        newPatient.setWeight(50.3);
        //Cuando abstraemos en setters and getters podemos hacer encapsulamiento
        //de las variables y hasta tener control sobre ellas
        newPatient.setPhoneNumber("123456789");
        System.out.println(newPatient.getPhoneNumber());

        //en este caso cumplirá la regla del negocio
        newPatient.setPhoneNumber("12345678");
        System.out.println(newPatient.getPhoneNumber());

        //showMenu();

        //creando citas

        newDoctor.addAvailableAppointments(new Date(), "4 pm");
        newDoctor.addAvailableAppointments(new Date(), "10 am");
        newDoctor.addAvailableAppointments(new Date(), "12 pm");

        //si imprimimos el get a la lista obtendremos la lista de objetos
        System.out.println(newDoctor.getAvailableAppointments());
        for (Doctor.AvailableAppointment element: newDoctor.getAvailableAppointments()
             ) {
            System.out.println(element.getDate() + " " + element.getTime());
        }

    }
}