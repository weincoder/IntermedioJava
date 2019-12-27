package dan.herr.san.poo.Session5;

public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

/*
    En este punto podemos ver como estamo sobre escribiendo el método toString
 */

    @Override
    public String toString() {
        return
                "el nombre del usuario es : "+this.name + "\nsu email : " + this.email;
    }
}
