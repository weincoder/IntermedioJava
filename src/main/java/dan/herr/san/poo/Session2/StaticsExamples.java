package dan.herr.san.poo.Session2;
import static dan.herr.san.poo.Session2.ui.UIMenu.*;


public class StaticsExamples {
    public static void main(String[] args) {


        //Declarando un objeto tipo doctor
        Doctor newDoctor;

        //instanciar el objeto
        newDoctor = new Doctor("Daniel Herrera", "Neurologo");

        //emplenado la sobrecarga de métodos para iniciar un objeto por default
         Doctor otherDoctor = new Doctor();
         System.out.println(otherDoctor.name);

        newDoctor.showName();

        showMenu();

    }
}