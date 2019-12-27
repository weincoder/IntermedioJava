package dan.herr.san.poo.Session5;

public class Patient extends User {


    private String birthday;
    private double weight;
    private double height;
    private String blood;

    /**
     * Constructor de la clase paciente
     *
     * @param name  Nombre del paciente
     * @param email e-mail del paciente
     */
    Patient(String name, String email) {
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + ".Kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height + "Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }



    @Override
    public String toString() {
        return super.toString()
                 +"\nEs un paciente y su estatura es : " + this.getHeight()
                +"\nSu peso : " + this.getWeight() + "\nsu cumpleaños : "+this.getBirthday()
                + "\n su sangre es del tipo : " + this.getBlood();
    }
}
