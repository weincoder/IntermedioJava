package dan.herr.san.poo.Session4;

public class Patient {
    int id;
    private String name;
    private String email;
    private String addres;
    private String phoneNumber;
    private String birthdy;
    private double weight;
    private double height;

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

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 8) {
            System.out.println("el numero debe ser igual a 8 digitos");
        } else  {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getBirthdy() {
        return birthdy;
    }

    public void setBirthdy(String birthdy) {
        this.birthdy = birthdy;
    }

    public String getWeight() {
        return this.weight + ".Kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height+ "Mts." ;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String blood;

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
