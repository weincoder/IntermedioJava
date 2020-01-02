package dan.herr.san.poo.Session6;

public class Nurse extends User {

    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showUserInfo() {
        System.out.println("es una enfermera de la facultad de la Universidad La Alegria de Vivir");
        System.out.println(String.format("cuenta con una especialidad de {} ",this.speciality));
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
