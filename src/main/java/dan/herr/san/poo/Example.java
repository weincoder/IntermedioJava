package dan.herr.san.poo;

public class Example {

    public static void main(String[] args) {

        //Declarando un objeto tipo doctor
        Doctor newDoctor;

        //instanciar el objeto
        newDoctor = new Doctor();

        //también podemos declarar e instanciar en una linea de la siguiente forma
        Doctor otherDoctor = new Doctor();

        //podemos definir atributos diferentes para cada uno
        newDoctor.name = "Daniel Herrera";
        otherDoctor.name = "Gabriel Galeano ";

        //cuando mostemos sus atributos serán diferentes
        newDoctor.showName();
        otherDoctor.showName();


    }
}
