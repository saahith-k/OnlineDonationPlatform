package models;

public class Donor {
    private String donorId;
    private String name;
    private String email;

    public Donor(String donorId, String name, String email) {
        this.donorId = donorId;
        this.name = name;
        this.email = email;
    }

    public String getDonorId() {
        return donorId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}