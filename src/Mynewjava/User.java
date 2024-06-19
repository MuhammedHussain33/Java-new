package Mynewjava;

public class User {
    int id;
    String name;
    String address;
    String phoneNumber;

    // Constructor to initialize the user object
    public User(int id, String name, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters for the fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User [ID=" + id + ", Name=" + name + ", Address=" + address + ", Phone Number=" + phoneNumber + "]";
    }
}
