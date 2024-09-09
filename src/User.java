public class User {
    private String name;
    private String email;
    private String pesel;
    private String address;
    private String phoneNumber;

    public User(String name, String email, String pesel, String address, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.pesel = pesel;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPesel() {
        return pesel;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void displayUserData() {
        System.out.println("Imię: " + name);
        System.out.println("Email: " + email);
        System.out.println("PESEL: " + pesel);
        System.out.println("Adres zamieszkania: " + address);
        System.out.println("Numer telefonu: " + phoneNumber);
    }
}
